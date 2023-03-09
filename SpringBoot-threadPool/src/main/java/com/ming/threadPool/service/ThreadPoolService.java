package com.ming.threadPool.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: ThreadPoolService
 * @Description: TODO
 * @Author: ECRZ
 * @Date: 2023/1/11
 * @Notes: TODO
 */
@Service
@EnableAsync
public class ThreadPoolService{
    @Async("taskExecutor")
    public String thread01() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        // System.out.println("current time:" + new Date() + ",thread name:" +Thread.currentThread().getName());
        return "current time:" + new Date() + ",thread name:" +Thread.currentThread().getName();
    }

    public String singleThread() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        return "current time:" + new Date() + ",thread name:" +Thread.currentThread().getName();
    }
}
