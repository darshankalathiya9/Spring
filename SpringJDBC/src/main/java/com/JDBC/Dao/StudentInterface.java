package com.JDBC.Dao;

import java.util.List;

import com.JDBC.Entity.Student;

public interface StudentInterface {
	public void insert(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(int studentID); 
	public Student getStudent(int studentID);
	public List<Student> gatAllStudent();
}
