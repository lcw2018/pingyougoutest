package com.lcw.msgspringboot08datamybatis.mapper;

import com.lcw.msgspringboot08datamybatis.entities.Bill;

/**
 * Create by chuanwen.li on 2019/8/9
 */
public interface BillMapper {


    Bill getBill(Integer bid);


    int addBill(Bill bill);


}
