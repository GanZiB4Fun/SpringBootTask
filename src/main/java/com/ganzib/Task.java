package com.ganzib;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.Future;

/**
 * Created by GanZiB on 16/12/1.
 */
@Component
public class Task {

    public static Random random = new Random();

    @Async
    public Future<String> doTaskOne() throws Exception{
        System.out.println("开始执行任务一");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("任务一完成，耗时："+(end-start)+"毫秒");
        return new AsyncResult<>("任务一完成");
    }

    @Async
    public Future<String> doTaskTwo() throws Exception{
        System.out.println("开始执行任务二");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("任务二完成，耗时："+(end-start)+"毫秒");

        return new AsyncResult<>("任务二完成");
    }

    @Async
    public Future<String> doTaskThree() throws Exception{
        System.out.println("开始执行任务三");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long endtime = System.currentTimeMillis();
        System.out.println("任务三完成，耗时："+(endtime-start)+"毫秒");
        return new AsyncResult<>("任务三完成");
    }

}
