package com.lcw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Create by chuanwen.li on 2019/8/5
 */


@SpringBootApplication
public class SpringBoot02Config02TestApplication {

    public static void main(String[] args) {

        System.out.println(System.getProperty("user.dir"));

        SpringApplication.run(SpringBoot02Config02TestApplication.class, args);

    }


}
