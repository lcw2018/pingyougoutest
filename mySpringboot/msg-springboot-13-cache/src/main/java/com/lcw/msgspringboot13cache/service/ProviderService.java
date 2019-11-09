package com.lcw.msgspringboot13cache.service;

import com.lcw.msgspringboot13cache.entity.Provider;
import com.lcw.msgspringboot13cache.mapper.ProviderMapper;
import com.lcw.msgspringboot13cache.utils.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by chuanwen.li on 2019/8/12
 */


@Service
public class ProviderService {


    @Autowired
    ProviderMapper providerMapper;

    @Autowired
    RedisClient redisClient;


    public Provider getProviderByPid(Integer pid) {

        //1.先查询一下缓存中是否有数据
        Object obj = redisClient.get(pid);

        if (obj != null) {

            return (Provider) obj;

        }
        //2.如果缓存中没有,则查数据库,然后添加到缓存中
        Provider providerByPid = providerMapper.getProviderByPid(pid);

        redisClient.set(pid, providerByPid);

        return providerByPid;


    }


    public Integer addProvider(Provider provider) {


        int size = providerMapper.addProvider(provider);
        if (size > 0) {
            //更新缓存数据
            redisClient.set(provider.getPid(), provider);
        }

        return size;

    }


    public Integer updateProvider(Provider provider) {

        int size = providerMapper.updateProvider(provider);

        if (size > 0) {

            redisClient.set(provider.getPid(), provider);


        }

        return size;
    }


    public Integer deleteProviderByPid(Integer pid) {

        int size = providerMapper.deleteProviderByPid(pid);

        if (size > 0) {

            //清除key=pid缓存
            redisClient.del(pid);

        }
        return size;

    }


}
