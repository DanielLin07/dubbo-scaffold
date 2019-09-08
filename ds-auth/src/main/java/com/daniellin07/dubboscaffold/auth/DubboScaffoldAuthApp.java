package com.daniellin07.dubboscaffold.auth;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 应用入口
 *
 * @author DanielLin07
 * @date 2019/9/1 17:52
 */
@SpringBootApplication
@NacosPropertySource(dataId = "example", autoRefreshed = true)
public class DubboScaffoldAuthApp {

	public static void main(String[] args) {
		SpringApplication.run(DubboScaffoldAuthApp.class, args);
	}

}
