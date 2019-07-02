package com.spring.producer.service.impl;

import com.spring.producer.controller.ProducersController;
import com.spring.producer.dao.CustInfoMapper;
import com.spring.producer.entity.CustInfo;
import com.spring.producer.service.CsutInfoService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class CsutInfoServiceImpl implements CsutInfoService {
    @Autowired
    public CustInfoMapper custInfoMapper;

    @Async
    @Override
    public CustInfo selectByPrimaryKey(String custNo) {
        LoggerFactory.getLogger(ProducersController.class).info(custNo + ":Hello World!");
        return custInfoMapper.selectByPrimaryKey(Integer.parseInt(custNo));
    }

    @Override
    public int insertSelective(CustInfo custInfo) {
        return custInfoMapper.insertSelective(custInfo);
    }
}
