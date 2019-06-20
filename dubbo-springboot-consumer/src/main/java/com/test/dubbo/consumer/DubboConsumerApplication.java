package com.test.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

/**
 * springboot+dubbo注解demo
 * @Description:消费者
 */
@SpringBootApplication
@EnableDubbo
@ComponentScan(basePackages={"com.test"})
public class DubboConsumerApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(DubboConsumerApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}