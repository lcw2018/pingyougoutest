package com.lcw.msgspringboot04web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Create by chuanwen.li on 2019/8/15
 * <p>
 * /**
 * * 1. @Configuration class of type WebMvcConfigurer but without @EnableWebMvc
 * * 1. 创建一个WebMvcConfigurer类型的子类
 * * 2. 类上用@Configuration标识它是一个配置类
 * * 3. 不能@EnableWebMvc标识
 * * 原理：
 * *  1.导入@Import({WebMvcAutoConfiguration.EnableWebMvcConfiguration.class})
 * *  2.  public static class EnableWebMvcConfiguration extends DelegatingWebMvcConfiguration {
 * *
 */

@EnableWebMvc  //完全控制SpringMVC
@Configuration
public class MySpringMvcConfigurer implements WebMvcConfigurer {


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {


        //发送 /msg请求 会来到success.html页面
        registry.addViewController("/msg").setViewName("success");

    }
}
