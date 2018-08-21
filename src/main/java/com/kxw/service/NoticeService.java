package com.kxw.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kxw.dao.NoticeDao;
import com.kxw.pojo.Notice;


@Service
public class NoticeService {

	@Autowired
	NoticeDao noticeDao;
	
	public List<Notice> getNotices()
	{
		
	    return noticeDao.getNotices();
	}
	
}
