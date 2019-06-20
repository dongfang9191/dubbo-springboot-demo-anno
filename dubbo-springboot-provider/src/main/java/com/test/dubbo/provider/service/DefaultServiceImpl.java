package com.test.dubbo.provider.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.test.dubbo.api.DefaultApiService;

@Service
public class DefaultServiceImpl implements DefaultApiService{
	
	public String defaultMethod(String str) {
		return "hello "+str;
	}
}
