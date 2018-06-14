package jp.co.example.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.example.dao.UserDao;

@Repository
public class PgUserDao implements UserDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int Insert(){
		return jdbcTemplate.update("INSERT INTO user_info (user_name, telephone, password) VALUES (?, ?, ?)");
		/*		new BeanPropertyRowMapper <UserInfo> (UserInfo.class));*/
	}
}
