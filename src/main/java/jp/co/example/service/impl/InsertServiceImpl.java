package jp.co.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.example.dao.UserDao;
import jp.co.example.service.InsertService;

@Service
public class InsertServiceImpl implements InsertService {

	@Autowired
	private UserDao userDao;

	@Override
	public int register(String name,String tel,String pass) {
		return userDao.register(name,tel,pass);
	}

}