package com.gust.demo.springdemo.service.impl;

import com.gust.demo.springdemo.listener.event.DemoEvent;
import com.gust.demo.springdemo.repository.DemoRepository;
import com.gust.demo.springdemo.repository.MultiRepository;
import com.gust.demo.springdemo.service.DemoService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("demoService")
public class DemoServiceImpl implements DemoService, ApplicationContextAware, InitializingBean {
	@Autowired(required = false)
	private DemoRepository demoRepository;
	@Resource(name="multi1")
	private MultiRepository multiRepository;

	private ApplicationContext applicationContext;

	@Override
	public void doService() {
		System.out.println(demoRepository);
	}

	@Override
	public void doListener() {
		this.applicationContext.publishEvent(new DemoEvent(this));
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("############################");
		System.out.println("repository result : " + demoRepository);
		System.out.println("############################");
	}
}
