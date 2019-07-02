package com.spring.producer.service;

import com.spring.producer.entity.CustInfo;


public interface CsutInfoService {

    CustInfo selectByPrimaryKey(String custNo);

    public int insertSelective(CustInfo custInfo);
}
