package com.kxw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kxw.dao.FriendlyLinkDao;
import com.kxw.pojo.FriendlyLink;
import com.kxw.pojo.FriendlyLinkExample;

@Service
public class LinkService {

	@Autowired
	FriendlyLinkDao friendlyLinkDao;
	public List<FriendlyLink> getLinks()
	 {
		FriendlyLinkExample example=new FriendlyLinkExample();
		 List<FriendlyLink> links=friendlyLinkDao.selectByExample(example);
		 
		 return links;
		 
	 }
	
}
