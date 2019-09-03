package com.h2t.study.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

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

    @TableField(value = "resource", exist = true)
    private String resource;

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

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }


}
