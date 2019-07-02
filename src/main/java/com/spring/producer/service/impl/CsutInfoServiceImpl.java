package com.spring.producer.service.impl;

import com.spring.producer.common.AsyncTaskService;
import com.spring.producer.controller.ProducersController;
import com.spring.producer.dao.CustInfoMapper;
import com.spring.producer.entity.CustInfo;
import com.spring.producer.service.CsutInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CsutInfoServiceImpl implements CsutInfoService {

    Logger log = LoggerFactory.getLogger(ProducersController.class);
    @Autowired
    public CustInfoMapper custInfoMapper;

    @Autowired
    private AsyncTaskService asyncTaskService;

    @Override
    public CustInfo selectByPrimaryKey(String custNo) {
        log.info(custNo + ":Hello World!");

        for (int i = 0; i < 20; i++) {
            asyncTaskService.executeAsyncTask(i);
        }
        CustInfo custInfo = custInfoMapper.selectByPrimaryKey(Integer.parseInt(custNo));
        asyncTaskService.executeAsyncTask(9999);
        return custInfo;
    }

    @Override
    public int insertSelective(CustInfo custInfo) {
        return custInfoMapper.insertSelective(custInfo);
    }
}
