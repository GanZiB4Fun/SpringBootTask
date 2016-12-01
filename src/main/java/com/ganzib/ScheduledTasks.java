package com.ganzib;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by GanZiB on 16/12/1.
 */
@Component
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH时mm分ss秒");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("北京时间"+dateFormat.format(new Date()));
    }

}
