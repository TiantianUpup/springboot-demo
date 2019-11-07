package com.h2t.study.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试类
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/11/07 14:21
 */
@RestController
public class TestController {
    @ApiOperation(value = "测试接口", notes = "传入字符串", httpMethod = "GET")
    @ApiImplicitParam(dataType = "string", name = "str", value = "字符串", required = true)
    @GetMapping("/test")
    public Object test(@RequestParam("str") String str) {
        return str;
    }
}
