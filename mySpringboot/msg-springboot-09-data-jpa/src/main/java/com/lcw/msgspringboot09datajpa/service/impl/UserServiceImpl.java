package com.lcw.msgspringboot09datajpa.service.impl;

import com.lcw.msgspringboot09datajpa.dao.UserRepository;
import com.lcw.msgspringboot09datajpa.entity.User;
import com.lcw.msgspringboot09datajpa.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Create by chuanwen.li on 2019/8/9
 */

@Service
public class UserServiceImpl implements IUserService {


    @Autowired
    UserRepository userRepository;

    //isolation指定隔离级别， propagation传播行为
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)//当前方法开启事务支持
    @Override
    public User addUser(User user) {

        //模拟转出账户
        userRepository.save(new User("1", "123", "小七"));
        userRepository.save(new User("12", "123", "小七"));
        userRepository.save(new User("123", "123", "小七"));
        userRepository.save(new User("1234", "123", "小七"));
        userRepository.save(new User("12345", "123", "小七"));

        int i = 1 / 0;
        //模拟转入账户
        userRepository.save(new User("123456", "123", "小七"));
        userRepository.save(new User("1234567", "123", "小七"));


        return null;

    }
}
