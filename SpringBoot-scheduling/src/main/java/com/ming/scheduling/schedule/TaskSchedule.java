package com.ming.scheduling.schedule;

import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: TaskSchedule
 * @Description: TODO
 * @Author: ECRZ
 * @Date: 2023/1/11
 */

public class TaskSchedule {
    // 秒 分钟 小时 日期 月份 星期
    /**
     * @Description: 根据cron表达式执行
     * @Author: ECRZ
     * @Date: 2023/1/11
     */
    @Scheduled(cron = "0/5 * * * * ?")
    public void task01(){
        System.out.println("task 01 ,current date:" + new Date());
    }

    /**
     * @Description: fixedRate 固定间隔后执行,在此期间即使是方法没有执行完，也会开始执行下一个定时任务
     * @Author: ECRZ
     * @Date: 2023/1/11
     */
    @Scheduled(fixedRate = 1000*1)
    public void task02() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        System.out.println("task 02 ,current date:" + new Date());
    }

    /**
     * @Description: fixedDelay  固定间隔后执行,在此期间定时任务会等待方法执行完，再执行下一个定时任务
     * @Author: ECRZ
     * @Date: 2023/1/11
     */
    @Scheduled(fixedDelay  = 1000*1)
    public void task03() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        System.out.println("task 03 ,current date:" + new Date());
    }
}
