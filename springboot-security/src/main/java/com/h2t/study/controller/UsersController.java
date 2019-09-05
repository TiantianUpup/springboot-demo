package com.h2t.study.controller;

import com.h2t.study.service.UsersService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户类控制层
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/08/30 13:45
 */
@RestController
@RequestMapping("/api/user")
public class UsersController {
    @Resource
    private UsersService usersService;

    @GetMapping("/guest")
    @PreAuthorize("hasAnyRole('guest')")
    public Object guest() {
        return "hello guest";
    }

    @PreAuthorize("hasAnyRole('admin')")
    @GetMapping("/admin")
    public Object admin() {
        return "hello admin";
    }
}
