package com.springboot.schedul;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduleServiceImpl {
    //计数器
    int count1 =1;
    int count2 =1;
    //每隔一秒执行一次
    @Scheduled(fixedRate = 1000)

    @Async
    public void job1(){
        System.out.println("【"+Thread.currentThread().getName()+"】"+"【job1】每秒钟执行一次,执行第【"+count1+"】次");
        count1++;
    }

    //每隔一秒执行一次
    @Scheduled(fixedRate = 1000)//配置为按时间间隔执行，每隔1 s便执行一次。单位是毫秒
    //使用异步执行
    @Async//@Async注解代表这需要使用异步线程执行
    public void job2(){
        System.out.println("【"+Thread.currentThread().getName()+"】"+"【job2】每秒执行一次，执行第【"+count2+"】次");
        count2++;
    }
    int count3 =1;
    int count4 =1;
    //Spring IoC容器初始化后，第一次延迟3秒，每隔1秒执行一次
    @Scheduled(initialDelay = 3000,fixedRate = 1000)
    @Async
    public void job3(){
        System.out.println("【"+Thread.currentThread().getName()+"】"+"【job3】每秒钟执行一次，执行第【"+count3+"】次");
        count3++;
    }
    //11:00到11：59点每分钟执行一次
    @Scheduled(cron = "0 * 11 * * ?")
    @Async
    public void job4(){
        System.out.println("【"+Thread.currentThread().getName()+"】【job4】每分钟执行一次，执行第【"+count4+"】次");
        count4++;
    }
}
