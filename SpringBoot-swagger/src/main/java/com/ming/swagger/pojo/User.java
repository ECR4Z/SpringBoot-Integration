package com.ming.swagger.pojo;

import io.swagger.annotations.ApiParam;

/**
 * @ClassName: User
 * @Description: TODO
 * @Author: ECRZ
 * @Date: 2022/12/30
 */
public class User {
    @ApiParam(value = "用户id")
    private String id;
    @ApiParam(value = "用户姓名")
    private String name;
    @ApiParam(value = "用户密码")
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
