package com.lcw.msgspringboot11task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Create by chuanwen.li on 2019/8/10
 */

@Service
public class AsyncService {


    @Async
    public  void batchAdd(){

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("批量添加完成...");

    }

}
