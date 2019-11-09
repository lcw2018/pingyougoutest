package com.lcw.msgspringboot13cache.mapper;

import com.lcw.msgspringboot13cache.entity.Provider;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Create by chuanwen.li on 2019/8/12
 */


public interface ProviderMapper {


    @Select("select * from provider where pid=#{pid}")
    Provider getProviderByPid(Integer pid);


    @Insert("insert into provider (providerCode,providerName,people,phone,address,fax,describe)" +
            "values(#{providerCode},#{providerName},#{people},#{phone},#{address},#{fax},#{describe})")
    int addProvider(Provider provider);


    @Update("update provider set providerCode=#{providerCode},providerName=#{providerName},people=#{people}" +
            ",phone=#{phone},address=#{address},fax=#{fax},describe=#{describe}")
    int updateProvider(Provider provider);


    @Delete("delete from provider where pid=#{pid}")
    int deleteProviderByPid(Integer pid);


}
