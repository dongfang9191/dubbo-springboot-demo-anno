package com.test.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

/**
 * springboot+dubbo注解demo
 * @Description:服务提供者启动类  
 */
@SpringBootApplication
@EnableDubbo
@ComponentScan(basePackages={"com.test"})
public class DubboProviderApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(DubboProviderApplication.class, args); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}