package com.spring.producer.service.impl;

import com.spring.producer.dao.CustInfoMapper;
import com.spring.producer.entity.CustInfo;
import com.spring.producer.service.CsutInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CsutInfoServiceImpl implements CsutInfoService {
    @Autowired
    public CustInfoMapper custInfoMapper;


    @Override
    public CustInfo selectByPrimaryKey(String custNo) {
        return custInfoMapper.selectByPrimaryKey(custNo);
    }
}
