package com.lcw.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lcw.SpringbootRedisApplication;
import com.lcw.dao.UserRepository;
import com.lcw.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Create by chuanwen.li on 2019/4/13
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootRedisApplication.class)
public class RedisTest {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RedisTemplate <String,String>redisTemplate;

    @Test
    public void redisTest() throws JsonProcessingException {
        String userListData = redisTemplate.boundValueOps("userForAll").get();
       if(userListData==null){

           List<User> all = userRepository.findAll();

           ObjectMapper objectMapper = new ObjectMapper();
           userListData= objectMapper.writeValueAsString(all);
           redisTemplate.boundValueOps("userForAll").set(userListData);

           System.out.println("==================从数据库中取数据===============");

       }else {

           System.out.println("==================从redis中取数据===============");


       }
        System.out.println(userListData);
    }
}
