package com.gust.demo.springdemo.listener.event;

import org.springframework.context.ApplicationEvent;

public class DemoEvent extends ApplicationEvent {

	public DemoEvent(Object source) {
		super(source);
	}
}
