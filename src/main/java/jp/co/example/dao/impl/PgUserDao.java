package jp.co.example.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.example.dao.UserDao;


@Repository
public class PgUserDao implements UserDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int register(String name,String tel,String pass){
		String sql = "INSERT INTO user_info(user_name,telephone,password)VALUES (?, ?, ?)";

		return jdbcTemplate.update(sql,name,tel,pass);

	}
}
