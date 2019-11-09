package com.lcw.msgspringboot13cache.mapper;

import com.lcw.msgspringboot13cache.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Create by chuanwen.li on 2019/8/12
 */
public interface UserMapper {



    @Select("select * from user where id=#{id}")
    User  getUserById(Integer id);


    @Insert("insert into user(username,realName,password,gender,birthday,userType)" +
            "values(#{username},#{realName},#{password},#{gender},#{birthday},#{userType})")
    int addUser(User user);



    @Update("update user set username=#{username},realName=#{realName},password=#{password}," +
            "gender=#{gender},birthday=#{birthday},userType=#{userType} where id=#{id}")
    int updateUser(User user);



    @Delete("delete from user where id =#{id}")
    int deleteUserByid(Integer id);











}
