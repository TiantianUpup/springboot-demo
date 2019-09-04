package com.h2t.study.controller;

import com.h2t.study.po.Users;
import com.h2t.study.service.UsersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * TODO Description
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/08/30 13:45
 */
@RestController
@RequestMapping("/user")
public class UsersController {
    @Resource
    private UsersService usersService;

    @GetMapping("/hello")
    public Object test() {
        return "hello user";
    }
}
