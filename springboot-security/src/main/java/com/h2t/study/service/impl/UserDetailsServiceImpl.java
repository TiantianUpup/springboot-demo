package com.h2t.study.service.impl;

import com.h2t.study.po.Users;
import com.h2t.study.service.UsersService;
import com.h2t.study.vo.UserVO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

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
        Users users = new Users();
        users.setUsername(username);
        List<Users> usersList = usersService.selectList(users);

        return buildUserVO(usersList);
    }

    /**
     * 组装UserVO对象
     *
     * @param usersList
     * @return
     * */
    private UserVO buildUserVO(List<Users> usersList) {
        UserVO userVO = new UserVO();
        userVO.setUsername(usersList.get(0).getUsername());
        userVO.setPassword(usersList.get(0).getPassword());
        List<String> resourceList = new ArrayList<>();
        for (Users users : usersList) {
            resourceList.add(users.getResource());
        }

        userVO.setResourceList(resourceList);
        return userVO;
    }
}
