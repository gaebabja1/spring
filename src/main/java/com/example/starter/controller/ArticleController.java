package com.example.starter.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.starter.dto.Article;
import com.example.starter.service.ArticleService;
import org.springframework.ui.Model;
import jline.internal.Log;
import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j //log를 보기위해서
public class ArticleController {
	
	@Autowired
	ArticleService articleservice;
	
	@RequestMapping("/article/list")
	public String showList(Model aModel)
	{
		List<Article> list = articleservice.getList();
		
		Log.info("list:"+list);
		aModel.addAttribute("list", list);
		return "article/list";
	}
}
