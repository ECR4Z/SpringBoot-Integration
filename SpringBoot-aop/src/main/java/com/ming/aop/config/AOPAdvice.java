package com.ming.aop.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AOPAdvice {
    /**
     * execution：在方法执行时触发
     * 第一个 * :返回任意类型
     * 第二个 * :任意类
     * 第三个 * :任意方法
     * 第四个 * :方法里传任意参数
     * 这里需要注意的是test方法并不会执行，环绕方法需要手动proceed（），不然被切入的类或方法不会执行
     */
    @Pointcut("execution(* com.ming.aop.controller.*.*(..))")
    public String test(){
        System.out.println("test");
        return "test";
    }


    @Before("test()")
    public void beforeAdvice(){
        System.out.println("before");
    }


    @After("test()")
    public void afterAdvice(){
        System.out.println("after");
    }

    @Around("test()")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("before");
        try {
            Object proceed = proceedingJoinPoint.proceed();
            System.out.println(proceed);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        System.out.println("after");
    }
}
