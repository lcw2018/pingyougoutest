package com.lcw.dao;

import com.lcw.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Create by chuanwen.li on 2019/4/12
 */
public interface UserRepostitory extends JpaRepository<User, Long> {
   // public List<User> findAll();

}
