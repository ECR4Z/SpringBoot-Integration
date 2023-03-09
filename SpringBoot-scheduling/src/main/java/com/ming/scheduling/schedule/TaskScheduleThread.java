package com.ming.scheduling.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @ClassName: TaskScheduleThread
 * @Description: 任务调度线程池
 * @Author: ECRZ
 * @Date: 2023/1/11
 */
@Component
public class TaskScheduleThread {
    @Scheduled(cron = "0/5 * * * * ?")
    public void task01Thread(){
        System.out.println(Thread.currentThread().getName() + "-------> task01Thread");
    }

    @Scheduled(cron = "0/3 * * * * ?")
    public void task02Thread(){
        System.out.println(Thread.currentThread().getName() + "-------> task02Thread");
    }

    @Scheduled(cron = "0/3 * * * * ?")
    public void task03Thread(){
        System.out.println(Thread.currentThread().getName() + "-------> task03Thread");
    }
}
