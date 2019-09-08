package com.daniellin07.dubboscaffold.auth.service.impl;

import com.daniellin07.dubboscaffold.auth.service.DemoService;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author DanielLin07
 * @date 2019/9/8 19:29
 */
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}
