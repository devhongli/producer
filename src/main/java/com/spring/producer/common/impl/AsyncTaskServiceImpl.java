package com.spring.producer.common.impl;

import com.spring.producer.common.AsyncTaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AsyncTaskServiceImpl implements AsyncTaskService {
    private static final Logger logger = LoggerFactory.getLogger(AsyncTaskServiceImpl.class);


    @Async
    @Override
    public void executeAsyncTask(int i) {
        logger.info("线程" + Thread.currentThread().getName() + " 执行异步任务：" + i);
        try {
            logger.info("线程等待开始时间" + new Date());
            Thread.sleep(10000);
            logger.info("线程等待结束时间" + new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
