package com.h2t.study.concurrent.task;

/**
 * 自定义任务
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/11/19 14:15
 */
public class MyTask implements Runnable {
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        while (true) {
            //执行一分钟
            if (System.currentTimeMillis() - start > 1000 * 60) {
                break;
            }
        }
    }
}
