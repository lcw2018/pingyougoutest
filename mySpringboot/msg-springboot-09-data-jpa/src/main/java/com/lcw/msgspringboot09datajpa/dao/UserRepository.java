package com.lcw.msgspringboot09datajpa.dao;

import com.lcw.msgspringboot09datajpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create by chuanwen.li on 2019/8/9
 */



public interface UserRepository extends JpaRepository<User, Integer> {
}
