# SpringBoot 整合教程
- SpringBoot-shiro 整合mybatis和shiro的一个简单实例
- SpringBoot-swagger 整合swagger的简单实例
- SpringBoot-aop 调取接口的时候，打印一条输出语句到控制台
- SpringBoot-jwt (JSON Web Token) 使用拦截器对接口进行授权
- SpringBoot-slf4j 对日志进行分批存储和打印
- SpringBoot-easyExcel 简单使用easyExcel进行Web excel的上传和下载
- SpringBoot-scheduling SpringBoot定时任务简单实例
- SpringBoot-threadPool SpringBoot线程池

### SpringBoot线程池
> SpringBoot线程池详解:https://www.jianshu.com/p/c82cacd6e356
> 线程状态详解:https://www.jianshu.com/p/b09392baddfd

### scheduling定时任务详解
> 默认情况下，如果什么都不进行配置，就会导致一个问题，系统中所有的定时任务都是使用的一个线程去执行的，也就是说，如果如果同一个时刻有2个定时任务需要执行，那么只可能有一个定时任务在执行，如果要解决这个问题可以定义一个自定的任务调度线程池即可。

> cron表达式详解:https://help.aliyun.com/document_detail/169784.html?spm=5176.13910061.sslink.4.10607fbbHfhVrM

### jwt注意事项
> jwt详解:https://www.ruanyifeng.com/blog/2018/07/json_web_token-tutorial.html

### swagger注意事项
> 导入Swagger依赖之后,在配置类中配置swagger的基础信息，需要注意的是要注明接口扫描方式apis() swagger 访问路径: */swagger-ui/index.html

### aop注意事项
> 这里需要注意的是切点方法test()并不会执行，环绕方法需要手动proceed()，不然被切入方法不会执行

### shiro授权流程
> 1. shiro会根据ShiroFilterFactoryBean此处的过滤器配置，在SpringBoot初始化的时候创建过滤器。
> 2. Web应用通过接口进行认证授权，（1.获取当前用户SecurityUtils.getSubject，2.UsernamePasswordToken生成Token 
> 3. subject.login 执行认证，之后如果过滤器里设置了要走授权，那么认证方法走完后还需要走授权方法）