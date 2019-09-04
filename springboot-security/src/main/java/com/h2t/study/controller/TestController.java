package com.h2t.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO Description
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/09/04 10:35
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public Object test() {
        return "hello world";
    }

    @GetMapping("/index")
    public Object success() {
        return "index page";
    }
}
