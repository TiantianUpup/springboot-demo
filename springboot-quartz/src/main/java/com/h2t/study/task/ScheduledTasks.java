package com.h2t.study.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 定时任务
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/10/15 13:55
 */
@Component
public class ScheduledTasks {
    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /**
     * 每隔5s打印时间
     */
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("The time now is : " + LocalDateTime.now().format(dateTimeFormatter));
    }
}
