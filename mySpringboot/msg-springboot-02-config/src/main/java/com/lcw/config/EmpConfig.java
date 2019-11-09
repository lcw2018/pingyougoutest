package com.lcw.config;

import com.lcw.service.EmpService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Create by chuanwen.li on 2019/8/5
 * * @Configuration 用于标识当前类是一个配置类, 来表示对应的Spring配置文件
 */

@Configuration
public class EmpConfig {
    /**
     * @Bean 标识的方法用于向容器中注入组件
     * 1. 返回值就是注入容器中的组件对象
     * 2. 方法名就是这个组件的 id 值
     * @return
     */

    @Bean
    public EmpService getService() {

        System.out.println("EmpService对象注入成功！");

        return new EmpService();

    }


}
