package com.spring.producer.controller;

import com.spring.producer.entity.CustInfo;
import com.spring.producer.service.CsutInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/producers-service")
@RestController
public class ProducersController {
    @Value("${server.port}")
    String port;

    @Autowired
    public CsutInfoService csutInfoService;

    @RequestMapping("/home")
    public String home(@RequestParam String name) {
        return  name + "i am from port:" + port;
    }

    @RequestMapping("/queryCustInfo")
    public CustInfo queryCustInfo(@RequestParam String custNo) {
        return  csutInfoService.selectByPrimaryKey(custNo);
    }
}
