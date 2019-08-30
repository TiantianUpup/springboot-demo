package com.h2t.study.service.impl;

import com.h2t.study.service.UsersService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 获取用户信息：用户名+密码+权限
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/08/30 11:44
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Resource
    private UsersService usersService;

    /**
     * 根据用户名获取用户信息
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
