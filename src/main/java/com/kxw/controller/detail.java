package com.kxw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kxw.pojo.Article;
import com.kxw.pojo.Category;
import com.kxw.service.ArticleService;
import com.kxw.service.CategoryService;

@Controller
public class detail {
	@Resource
	CategoryService categoryService;
	@Autowired
	ArticleService articleService;
	@RequestMapping("detail_{id}.html")
	public ModelAndView detailpage(@PathVariable("id") int id)
	{
		List<Category> categorys=categoryService.getCategorys();
		 Article article=articleService.selectByPrimaryKey(id);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("article", article);
		modelAndView.setViewName("detail");
		modelAndView.addObject("categorys",categorys);
		return modelAndView;
	}

}
