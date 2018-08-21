package com.kxw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kxw.dao.CategoryDao;
import com.kxw.pojo.Category;

@Service
public class CategoryService {

	@Autowired
	CategoryDao categoryDao;
	
	public List<Category> getCategorys()
	{
		
		
		return categoryDao.getCategorys();
	}
}
