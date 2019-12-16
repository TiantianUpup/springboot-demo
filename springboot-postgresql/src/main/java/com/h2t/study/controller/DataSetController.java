package com.h2t.study.controller;

import com.h2t.study.service.DataSetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 控制层
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/12/16 10:55
 */
@RestController
@RequestMapping("/api/dataset")
public class DataSetController {
    @Resource
    private DataSetService fileSetService;

    @GetMapping("/{user_uuid}")
    public Object listFileSetByUserId(@PathVariable("user_uuid") String userUuid) {
        return fileSetService.listDataSetByUserId(userUuid);
    }
}
