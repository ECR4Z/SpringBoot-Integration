package com.ming.threadPool.controller;

import com.ming.threadPool.service.ThreadPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ThreadPoolController
 * @Description: TODO
 * @Author: ECRZ
 * @Date: 2023/1/11
 * @Notes: TODO
 */
@RestController
@RequestMapping("thread")
public class ThreadPoolController {
    @Autowired
    private ThreadPoolService threadPoolService;
    @GetMapping("/testThread")
    public String testThread() throws InterruptedException {
        return threadPoolService.thread01();
    }

    @GetMapping("/singleThread")
    public String singleThread() throws InterruptedException {
        return threadPoolService.singleThread();
    }
}
