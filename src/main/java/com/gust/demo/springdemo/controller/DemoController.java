package com.gust.demo.springdemo.controller;

import com.gust.demo.springdemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	@Autowired
	private DemoService demoService;

	@RequestMapping("/doService")
	public String doService(){
		demoService.doService();
		return "service";
	}

	@RequestMapping("/doListener")
	public String doListener(){
		demoService.doListener();
		return "service";
	}
}
