package jp.co.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import jp.co.example.dao.UserDao;
import jp.co.example.service.InsertService;

public class InsertServiceImpl implements InsertService {

	@Autowired
	private UserDao userDao;

	@Override
	public int insert() {
		 return userDao.Insert();
	}

}
