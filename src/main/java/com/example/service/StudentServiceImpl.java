package com.example.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.example.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> getList() {
		String sql = "SELECT user_id,email,first_name,current_tenant_id,last_name,password FROM WH_BU_USER";
		return (List<Student>) jdbcTemplate.query(sql, new RowMapper<Student>() {
			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student stu = new Student();
				stu.setId(0);
				stu.setAge(rs.getString("email"));
				stu.setName(rs.getString("first_name"));
				stu.setSumScore(rs.getString("current_tenant_id"));
				stu.setAvgScore(rs.getString("last_name"));
				return stu;
			}
		});
	}

}
