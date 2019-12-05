package com.example.starter.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Configuration
@EnableAutoConfiguration
public class HomeController {
	@RequestMapping("/home/main")
	@ResponseBody
	public String showMain()
	{
		return"메인 화면";
	}
}
