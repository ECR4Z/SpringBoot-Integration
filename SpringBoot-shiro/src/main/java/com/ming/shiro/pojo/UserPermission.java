package com.ming.shiro.pojo;

import com.baomidou.mybatisplus.annotations.TableName;

/**
 * @ClassName: UserPermission
 * @Description: TODO
 * @Author: ECRZ
 * @Date: 2022/12/29
 */
@TableName("user_permission")
public class UserPermission {
    private String role_type;
    private String role_permission;

    public String getRole_type() {
        return role_type;
    }

    public void setRole_type(String role_type) {
        this.role_type = role_type;
    }

    public String getRole_permission() {
        return role_permission;
    }

    public void setRole_permission(String role_permission) {
        this.role_permission = role_permission;
    }
}
