package com.ming.shiro.pojo;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * @ClassName: User
 * @Description: 创建实体类User，此处需要注意的是，bean的字段名称尽量和表字段一致
 * @Author: ECRZ
 * @Date: 2022/12/28
 */
@TableName("user")
public class User {

    private String user_id;

    private String user_name;

    private String user_password;

    private String user_type;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }
}
