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
    private String username;

    @TableField(value = "password", exist = true)
    private String password;

    @TableField(value = "role", exist = true)
    private String role;

    //getter and setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


}
