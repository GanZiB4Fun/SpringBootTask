package com.ganzib;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.Future;

import static org.junit.Assert.*;

/**
 * Created by GanZiB on 16/12/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(ExpApplication.class)

public class TaskTest {

    @Autowired
    private  Task task;

    @Test
    public void test() throws Exception{

        long start = System.currentTimeMillis();

        Future<String> task1 = task.doTaskOne();
        Future<String> task2 = task.doTaskTwo();
        Future<String> task3 = task.doTaskThree();
        while (true){
            if(task1.isDone() &&task2.isDone() && task3.isDone() ){
                break;
            }
            Thread.sleep(1000);
        }
        long end = System.currentTimeMillis();
        System.out.println("任务全部完成，总耗时:"+(end-start)+"毫秒");
    }


}