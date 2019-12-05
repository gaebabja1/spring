package com.example.starter.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.starter.dto.Article;
import com.example.starter.service.ArticleService;
import org.springframework.ui.Model;
import jline.internal.Log;
import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j //log
public class ArticleController {
	
	@Autowired
	ArticleService articleService;
	
	@RequestMapping("/article/list")
	public String showList(Model aModel)
	{
		List<Article> list = articleService.getList();
		
		Log.info("list:"+list);
		aModel.addAttribute("list", list);
		return "article/list";
	}
	
	@RequestMapping("/article/add")
	public String showAdd()
	{
		
		return "article/add";
	}
	
	@RequestMapping("/article/doAdd")
	@ResponseBody
	public String doAdd(@RequestParam Map<String, Object> param){
		
		long newId = articleService.add(param);

		return newId + "번 게시물이 추가되었습니다.";
	}
	
		
		
	
}
