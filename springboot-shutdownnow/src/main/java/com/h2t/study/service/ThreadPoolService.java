package com.h2t.study.service;

import java.util.List;

/**
 * TODO Description
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/11/18 20:48
 */
public interface ThreadPoolService {
    void start() throws InterruptedException;

    void stop();

    List<Runnable> getRunnableList();
}
