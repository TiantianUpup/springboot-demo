package com.h2t.study.service.impl;

import com.h2t.study.concurrent.TrackingExecutor;
import com.h2t.study.concurrent.task.MyTask;
import com.h2t.study.service.ThreadPoolService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * TODO Description
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/11/18 20:47
 */
@Service
public class ThreadPoolServiceImpl implements ThreadPoolService {
    private TrackingExecutor trackingExecutor = new TrackingExecutor(Executors.newFixedThreadPool(3));

    private List<Runnable> runnableList;

    public void start() {
        //添加10个任务
        for (int i = 0; i < 5; i++) {
            trackingExecutor.execute(new MyTask());
        }
    }

    public void stop() {
        //立刻关闭线程池
        runnableList = trackingExecutor.shutdownNow();
        runnableList.stream().forEach(i -> System.out.println("List MyTask: " + i));
        try {
            if (trackingExecutor.awaitTermination(30, TimeUnit.SECONDS)) {
                for (Runnable runnable : trackingExecutor.getCancelledTasks()) {
                    System.out.println("Cancelled MyTask: " + runnable);
                    runnableList.add(runnable);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public List<Runnable> getRunnableList() {
        for (Runnable runnable : runnableList) {
            System.out.println("getRunnableList: " + runnable);
        }
        return runnableList;
    }
}
