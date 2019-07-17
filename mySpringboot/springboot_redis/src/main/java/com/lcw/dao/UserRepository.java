package com.lcw.dao;

import com.lcw.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create by chuanwen.li on 2019/4/13
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
