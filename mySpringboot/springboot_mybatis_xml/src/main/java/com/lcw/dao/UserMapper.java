package com.lcw.dao;

import com.lcw.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Create by chuanwen.li on 2019/4/12
 */

@Mapper
public interface UserMapper {


    public List<User> findAllUser();

}
