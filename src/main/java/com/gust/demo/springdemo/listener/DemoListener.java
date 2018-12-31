package com.gust.demo.springdemo.listener;

import com.gust.demo.springdemo.listener.event.DemoEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

	@Override
	public void onApplicationEvent(DemoEvent demoEvent) {
		System.out.println("监听执行了");
	}
}
