package com.h2t.study.vo;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 用户业务层处理对象
 *
 * @Author: hetiantian
 * @Date:2019/9/3 22:52 
 * @Version: 1.0
 */
public class UserVO implements UserDetails {
    /**
     * 用户名
     * */
    private String username;

    /**
     * 密码
     * */
    private String password;

    /**
     * 权限列表
     * */
    private List<String> resourceList;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<String> resourceList) {
        this.resourceList = resourceList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorityList = new ArrayList<>();
        for (String resource : resourceList) {
            authorityList.add(new SimpleGrantedAuthority(resource));
        }

        return authorityList;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
