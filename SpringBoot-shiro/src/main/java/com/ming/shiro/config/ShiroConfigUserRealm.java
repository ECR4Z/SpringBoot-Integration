package com.ming.shiro.config;

import com.ming.shiro.pojo.User;
import com.ming.shiro.pojo.UserPermission;
import com.ming.shiro.service.UserPermissionService;
import com.ming.shiro.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

/**
 * @ClassName: ShiroConfigUserRealm
 * @Description: TODO
 * @Author: ECRZ
 * @Date: 2022/12/29
 */

public class ShiroConfigUserRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;

    @Autowired
    private UserPermissionService userPermissionService;

    /**
     * 执行授权逻辑
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行了=>授权逻辑PrincipalCollection");
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        Subject subject = SecurityUtils.getSubject();
        User user = (User) subject.getPrincipal();
        UserPermission permission = userPermissionService.getPermission(user.getUser_type());
        String role_permission = permission.getRole_permission();
        String[] permissionList = role_permission.split(",");
        Arrays.stream(permissionList).forEach(s -> simpleAuthorizationInfo.addStringPermission(s));
        return simpleAuthorizationInfo;
    }

    /**
     * 执行认证逻辑
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行了=>认证逻辑AuthenticationToken");
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        User user = userService.queryByName(token.getUsername());
        if (user == null) {
            return null;
        }
        return new SimpleAuthenticationInfo(user, user.getUser_password(), "");
    }
}
