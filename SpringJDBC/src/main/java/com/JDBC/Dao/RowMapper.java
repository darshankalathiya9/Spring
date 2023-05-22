package com.JDBC.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.JDBC.Entity.Student;

public class RowMapper implements org.springframework.jdbc.core.RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setID(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setCity(rs.getString(3));
		
		return student;
	}

}
