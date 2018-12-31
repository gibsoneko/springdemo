package com.gust.demo.springdemo.service.impl;

import com.gust.demo.springdemo.service.InitService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InitServiceImpl implements InitService, InitializingBean {

	@PostConstruct
	public void postConstruct() {
		System.out.println("postConstruct 执行了");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet 执行了");
	}
}
