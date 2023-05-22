package com.JDBC.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.JDBC.Entity.Student;

//@Component("studentDao")
public class StudentDao implements StudentInterface {

//	@Autowired
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

	public Student getStudent(int studentID) {
		String query = "select * from student where ID=?";
		org.springframework.jdbc.core.RowMapper<Student> rowMapper = new RowMapper();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentID);
		return student;
	}

	public List<Student> gatAllStudent() {
		String query = "select * from Student";
		List<Student> list = this.jdbcTemplate.query(query, new RowMapper());
		return list;
	}

}
