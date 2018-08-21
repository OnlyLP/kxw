package com.kxw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class detail {
	
	@RequestMapping("detail")
	public String detailpage(Long id)
	{
		
		
		return "detail";
	}

}
