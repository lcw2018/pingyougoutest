package com.lcw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Create by chuanwen.li on 2019/8/4
 */

/**
 * @ImportResource(locations = {"classpath:spring01.xml"})
 * 用于导入spring的配置文件，并将它加载到容器中
 */


//@ImportResource(locations = {"classpath:spring01.xml"})
@SpringBootApplication
public class SpringBoot02ConfigApplication {


    public static void main(String[] args) {

        SpringApplication.run(SpringBoot02ConfigApplication.class, args);

    }
}
