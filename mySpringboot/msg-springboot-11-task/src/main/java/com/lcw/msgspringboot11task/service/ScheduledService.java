package com.lcw.msgspringboot11task.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Create by chuanwen.li on 2019/8/10
 */

/**
 * 创建定时任务
 */
@Service
public class ScheduledService {


    private static int count = 1;

    @Scheduled(cron = "0/3 * * * * *") //注意中间有空格
    public void addCount() {


        System.out.println("数据统计第" + count++ + "秒");


    }


}
