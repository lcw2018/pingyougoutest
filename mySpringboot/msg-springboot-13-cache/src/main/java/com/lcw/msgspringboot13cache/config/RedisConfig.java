package com.lcw.msgspringboot13cache.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import java.net.UnknownHostException;

/**
 * Create by chuanwen.li on 2019/8/12
 */

@Configuration
public class RedisConfig {


    @Bean
    public RedisTemplate<Object, Object> jsonRedisTemplate(RedisConnectionFactory redisConnectionFactory)
            throws UnknownHostException {

        RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<>();

        redisTemplate.setDefaultSerializer(new Jackson2JsonRedisSerializer(Object.class));
        redisTemplate.setConnectionFactory(redisConnectionFactory);

        return redisTemplate;
    }


}
