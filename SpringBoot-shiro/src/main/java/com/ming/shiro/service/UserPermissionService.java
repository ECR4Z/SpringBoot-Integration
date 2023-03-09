package com.ming.shiro.service;

import com.ming.shiro.dao.UserPermissionDao;
import com.ming.shiro.pojo.UserPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserPermissionService
 * @Description: TODO
 * @Author: ECRZ
 * @Date: 2022/12/29
 */
@Service
public class UserPermissionService {
    @Autowired
    private UserPermissionDao userPermissionDao;

    public UserPermission getPermission(String userType){
        UserPermission userPermission = new UserPermission();
        userPermission.setRole_type(userType);
        return userPermissionDao.selectOne(userPermission);
    }
}
