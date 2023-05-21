package com.JDBC.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.JDBC.Entity.Student;

public class StudentDao implements StudentInterface {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
		String query = "insert into student (ID, Name, City) values (?,?,?)";
		int r = this.jdbcTemplate.update(query, student.getID(), student.getName(), student.getCity());
		return r;
	}

}
