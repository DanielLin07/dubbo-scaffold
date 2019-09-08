package com.daniellin07.dubboscaffold;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 应用入口
 *
 * @author DanielLin07
 * @date 2019/9/1 17:52
 */
@EnableAutoConfiguration
public class DubboAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboAuthApplication.class, args);
	}

}
