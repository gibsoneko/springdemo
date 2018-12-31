package com.gust.demo.springdemo.config;

import com.gust.demo.springdemo.service.impl.InitServiceImpl1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {

	@Bean(initMethod = "doInit")
	public InitServiceImpl1 getInitService() {
		return new InitServiceImpl1();
	}
}
