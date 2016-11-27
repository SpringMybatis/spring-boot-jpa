package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.entity.Demo;

@Repository
public class DemoDAOImpl implements DemoDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Demo getDemoById(Long id) {
		String sql = "select * from demo where id = ?";
		RowMapper<Demo> rowMapper = new BeanPropertyRowMapper<Demo>(Demo.class);
	    return jdbcTemplate.queryForObject(sql,rowMapper,id);
	}

}
