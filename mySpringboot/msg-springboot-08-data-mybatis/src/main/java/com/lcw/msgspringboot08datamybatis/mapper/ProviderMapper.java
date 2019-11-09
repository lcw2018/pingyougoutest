package com.lcw.msgspringboot08datamybatis.mapper;

import com.lcw.msgspringboot08datamybatis.entities.Provider;
import org.apache.ibatis.annotations.*;

/**
 * Create by chuanwen.li on 2019/8/9
 */
public interface ProviderMapper {


    @Select("select * from  provider  where pid=#{pid}")
    Provider getProviderById(Integer pid);
    //useGeneratedKeys是否使用自增主键，keyProperty指定实体类中的哪一个属性封装主键值
    @Options(useGeneratedKeys = true,keyProperty = "pid")
    @Insert("insert into provider(providerName)values(#{providerName}) ")
    int addProvider(Provider provider);


    @Delete("delete from provider where pid=#{pid}")
    int deleteProviderById(Integer pid);


    @Update("update provider set providerName=#{providerName} where pid=#{pid} ")
    int updateProvider(Provider provider);

}
