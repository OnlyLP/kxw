package com.kxw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kxw.dao.NoticeDao;
import com.kxw.pojo.Category;
import com.kxw.pojo.Notice;
import com.kxw.service.CategoryService;
import com.kxw.service.NoticeService;

@Controller
public class index {
	
	@Resource
	CategoryService categoryService;
	@Autowired
	NoticeService noticeService;
	
	
	@RequestMapping({"/","/index"})
	public ModelAndView pageIndex(ModelAndView model){
		
	List<Category> categorys=categoryService.getCategorys();
	List<Notice> notices=noticeService.getNotices();
	model.addObject("notices",notices);
	model.addObject("categorys",categorys);
	model.setViewName("index");
	
	return model;
	}
}
