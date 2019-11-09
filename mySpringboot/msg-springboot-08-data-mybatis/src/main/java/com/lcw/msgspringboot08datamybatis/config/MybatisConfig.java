package com.lcw.msgspringboot08datamybatis.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Create by chuanwen.li on 2019/8/9
 */


@Configuration
public class MybatisConfig {


    @Bean
    public ConfigurationCustomizer configurationCustomizer() {


        return new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {

                configuration.setMapUnderscoreToCamelCase(true);

            }
        };


    }


}
