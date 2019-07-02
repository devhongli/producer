package com.spring.producer.common;

import org.springframework.scheduling.annotation.Async;

public interface AsyncTaskService {
    /**
     * 执行异步任务
     * 可以根据需求，自己加参数拟定，我这里就做个测试演示
     */
    @Async
    void executeAsyncTask(int i);
}
