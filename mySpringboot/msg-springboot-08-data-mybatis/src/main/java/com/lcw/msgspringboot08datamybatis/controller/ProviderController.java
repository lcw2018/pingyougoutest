package com.lcw.msgspringboot08datamybatis.controller;

import com.lcw.msgspringboot08datamybatis.entities.Provider;
import com.lcw.msgspringboot08datamybatis.mapper.ProviderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by chuanwen.li on 2019/8/9
 */


@RestController
public class ProviderController {


    @Autowired
    ProviderMapper providerMapper;


    @RequestMapping("/provider/{pid}")
    public Provider getProvider(@PathVariable("pid") Integer pid) {

        Provider providerById = providerMapper.getProviderById(pid);

        return providerById;

    }


    @RequestMapping("/provider")
    public Provider addProvider(Provider provider) {

        providerMapper.addProvider(provider);

        return provider;
    }


}
