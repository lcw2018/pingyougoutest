package com.lcw.msgspringboot13cache.service;

import com.lcw.msgspringboot13cache.entity.Provider;
import com.lcw.msgspringboot13cache.entity.User;
import com.lcw.msgspringboot13cache.mapper.ProviderMapper;
import com.lcw.msgspringboot13cache.mapper.UserMapper;
import com.lcw.msgspringboot13cache.utils.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Create by chuanwen.li on 2019/8/12
 */

@Service
@CacheConfig(cacheNames = "user") //指缓存公共属性
public class UserService {


    @Autowired
    UserMapper userMapper;


    /**
     * @param id
     * @return
     */
    @Cacheable(/*cacheNames = "user",*/key = "#id")
    public User getUserById(Integer id) {

        User user = userMapper.getUserById(id);

        return user;

    }


    /**
     * //cacheNames = "user"
     * //必须 指定一个缓存名称，不指定报500
     *
     * @param user
     * @return
     */
    @CachePut(/*cacheNames = "user",*/key = "#result.id")
    public User updateUser(User user) {

        userMapper.updateUser(user);

        return user;

    }

    /**
     * 默认情况下删除数据不会将缓存中的数据删除
     * allEntries = true 会将缓存中的所有数据清空
     * beforeInvocation = true， 为true的时候会先调用缓存清空
     *
     * @param id
     * @return
     */
    @CacheEvict(/*cacheNames = "user",*/key = "#id", allEntries = true/*,beforeInvocation = true*/)
    public Integer deleteUser(Integer id) {

        userMapper.deleteUserByid(id);

        return id;

    }


}
