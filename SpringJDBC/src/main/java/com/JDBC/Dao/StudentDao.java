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

	public void insert(Student student) {
		String query = "insert into student (ID, Name, City) values (?,?,?)";
		this.jdbcTemplate.update(query, student.getID(), student.getName(), student.getCity());
	}

	public void updateStudent(Student student) {
		String query = "update student set Name=?, City=? where ID=?";
		this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getID());
	}

	public void deleteStudent(int studentID) {
		String query = "delete from student where ID=?";
		this.jdbcTemplate.update(query, studentID);
	}

}
