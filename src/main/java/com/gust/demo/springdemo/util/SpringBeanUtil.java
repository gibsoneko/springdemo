package com.gust.demo.springdemo.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanUtil implements ApplicationContextAware {
	private static ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContextTmp) throws BeansException {
		if (applicationContext == null) {
			applicationContext = applicationContextTmp;
		}
	}

	public static <T> T getBeanByName(String name) {
		return (T) applicationContext.getBean(name);
	}
}
