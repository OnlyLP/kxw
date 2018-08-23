package com.kxw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kxw.dao.ArticleDao;
import com.kxw.pojo.Article;
import com.kxw.pojo.ArticleExample;

@Service
public class ArticleService {
	@Autowired
	ArticleDao articleDao;
	
	public List<Article> getArticles()
	 {
		 ArticleExample example=new ArticleExample();
		 List<Article> articles=articleDao.selectByExample(example);
		 
		 return articles;
		 
	 }
	public Article selectByPrimaryKey(int id)
	 {
		 
		 Article article=articleDao.selectByPrimaryKey(id);
		 
		 return article;
		 
	 }
	 
	 
	 
	 
	

}
