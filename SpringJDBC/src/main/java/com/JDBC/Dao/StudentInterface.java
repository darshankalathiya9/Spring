package com.JDBC.Dao;

import com.JDBC.Entity.Student;

public interface StudentInterface {
	public void insert(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(int studentID); 
}
