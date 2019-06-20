package com.test.dubbo.consumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.test.dubbo.api.DefaultApiService;

@RestController
public class DemoConsumerController {
	
	@Reference
	private DefaultApiService defaultService; 
	
	@RequestMapping("/sayHello")
	public String sayHello(@RequestParam String name) {
		return defaultService.defaultMethod(name);
	}

}