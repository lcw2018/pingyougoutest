package com.lcw.msgspringboot13cache.controller;

import com.lcw.msgspringboot13cache.entity.Provider;
import com.lcw.msgspringboot13cache.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by chuanwen.li on 2019/8/12
 */

@RestController
public class ProviderController {


    @Autowired
    ProviderService providerService;

    @RequestMapping("/provider/{pid}")
    public Provider getProviderByPid(@PathVariable("pid") Integer pid) {

        Provider providerByPid = providerService.getProviderByPid(pid);

        return providerByPid;

    }


    @RequestMapping("/addProvider")
    public Integer addProvider(Provider provider) {

        Integer size = providerService.addProvider(provider);

        return size;

    }

    @RequestMapping("/updateProvider")
    public Integer updateProvider(Provider provider) {


        Integer size = providerService.updateProvider(provider);

        return size;
    }


    @RequestMapping("/deleteProvider/{pid}")
    public Integer deleteProvider(@PathVariable("pid") Integer pid) {

        Integer size = providerService.deleteProviderByPid(pid);

        return pid;

    }


}
