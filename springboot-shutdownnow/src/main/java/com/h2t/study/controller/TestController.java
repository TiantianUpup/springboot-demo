package com.h2t.study.controller;

import com.h2t.study.service.ThreadPoolService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * TODO Description
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/11/18 20:44
 */
@RestController
public class TestController {
    @Resource
    private ThreadPoolService threadPoolService;

    @GetMapping("/start")
    public Object start() throws InterruptedException {
        threadPoolService.start();
        return "start";
    }

    @GetMapping("/stop")
    public Object stop() {
        threadPoolService.stop();
        return "stop";
    }

    @GetMapping("/runnable/list")
    public List<Runnable> getRunnableList() {
        List<Runnable> runnableList = threadPoolService.getRunnableList();
        runnableList.stream().forEach(i -> System.out.println("controller: " + i));
        return threadPoolService.getRunnableList();
    }
}
