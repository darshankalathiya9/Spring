package com.JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.JDBC.Dao.StudentDao;
import com.JDBC.Entity.Student;

public class App {
	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("com/JDBC/Config.xml");
		
		/*
		 * JdbcTemplate template = apc.getBean("JDBCTemplate", JdbcTemplate.class);
		 * 
		 * String query = "insert into student (ID, Name, City) values (?,?,?)";
		 * 
		 * int reslut = template.update(query, 9, "DK", "Bhavnagar");
		 * System.out.println("Number of Record Inserted." + reslut);
		 */

		StudentDao studentDao = apc.getBean("studentDao",StudentDao.class);
		
		Student student = new Student();
		student.setID(222);
		student.setName("Bhano");
		student.setCity("Amreli");
		
		int reslut = studentDao.insert(student);
		System.out.println("Student Added Sucessfully"+reslut);
		
	}
}
