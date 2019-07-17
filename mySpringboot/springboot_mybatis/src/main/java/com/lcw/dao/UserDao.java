package com.lcw.dao;

import com.lcw.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Create by chuanwen.li on 2019/4/12
 */

@Mapper
public interface UserDao {

    @Select("select * from user")
    public List<User> queryUserList();

}
