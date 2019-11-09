package com.lcw.msgspringboot04web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
public class MsgSpringboot04WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsgSpringboot04WebApplication.class, args);
    }


    @Bean
    public ViewResolver myResolver() {

        return new MyResolver();
    }


    private class MyResolver implements ViewResolver {
        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }
}
