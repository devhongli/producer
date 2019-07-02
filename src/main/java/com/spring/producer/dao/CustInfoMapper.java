package com.spring.producer.dao;

import com.spring.producer.entity.CustInfo;

public interface CustInfoMapper {
    int deleteByPrimaryKey(Integer custNo);

    int insert(CustInfo record);

    int insertSelective(CustInfo record);

    CustInfo selectByPrimaryKey(Integer custNo);

    int updateByPrimaryKeySelective(CustInfo record);

    int updateByPrimaryKey(CustInfo record);
}