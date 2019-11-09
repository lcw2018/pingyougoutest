package com.lcw.msgspringboot08datamybatis.controller;

import com.lcw.msgspringboot08datamybatis.entities.Bill;
import com.lcw.msgspringboot08datamybatis.mapper.BillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by chuanwen.li on 2019/8/9
 */


@RestController
public class BillController {

    @Autowired
    BillMapper billMapper;


    @RequestMapping("/bill/{bid}")
    public Bill getBill(@PathVariable("bid") Integer bid) {

        Bill bill = billMapper.getBill(bid);

        return bill;

    }


    @RequestMapping("/bill")
    public Bill addBill(Bill bill) {

      billMapper.addBill(bill);


        return bill;


    }


}
