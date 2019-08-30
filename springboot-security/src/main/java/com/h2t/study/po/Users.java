package com.h2t.study.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 用户实体类
 *
 * @author hetiantian
 * @since 2019-08-13
 */
@TableName(value = "users")
public class Users extends BasePO {
    @TableField(value = "user_name", exist = true)
    private String userName;

    @TableField(value = "password", exist = true)
    private String password;

    @TableField(value = "password", exist = true)
    private String resource;

    //getter and setter
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", resource='" + resource + '\'' +
                '}';
    }
}
