package com.spring.producer.service;

import com.spring.producer.entity.CustInfo;
import org.springframework.stereotype.Service;


public interface CsutInfoService {

    CustInfo selectByPrimaryKey(String custNo);
}
