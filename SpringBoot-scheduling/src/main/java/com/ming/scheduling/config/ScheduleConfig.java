package com.ming.scheduling.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

/**
 * @ClassName: ScheduleConfig
 * @Description: 配置定时任务的线程池
 * @Author: ECRZ
 * @Date: 2023/1/11
 * @Notes: 注意此处的Configuration表示当前类是一个配置类，即使用注解来实现bean.xml中的bean注册 详情请看:https://www.jianshu.com/p/6408efea50fa
 */
@Configuration
public class ScheduleConfig {
    @Bean
    public TaskScheduler scheduleThreadPool(){
        ThreadPoolTaskScheduler schedulerPool = new ThreadPoolTaskScheduler();
        schedulerPool.setPoolSize(10);
        schedulerPool.setThreadNamePrefix("scheduling-pool");
        return schedulerPool;
    }
}
