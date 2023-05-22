package com.JDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.JDBC.Dao.StudentDao;
import com.JDBC.Entity.Student;

public class App {
	public static void main(String[] args) {

//		ApplicationContext apc = new ClassPathXmlApplicationContext("com/JDBC/Config.xml");
		ApplicationContext apc = new AnnotationConfigApplicationContext(JDBCConfig.class);

		/*
		 * JdbcTemplate template = apc.getBean("JDBCTemplate", JdbcTemplate.class);
		 * 
		 * String query = "insert into student (ID, Name, City) values (?,?,?)";
		 * 
		 * int reslut = template.update(query, 9, "DK", "Bhavnagar");
		 * System.out.println("Number of Record Inserted." + reslut);
		 */

		StudentDao studentDao = apc.getBean("studentDao", StudentDao.class);

//		Student student = new Student();
//		student.setID(444);
//		student.setName("Piyush Ramnani");
//		student.setCity("Ahmedabad");

		/* Insert Opration */
//		studentDao.insert(student);
//		System.out.println("Student Added Sucessfully...");

		/* Update Opration */
//		studentDao.updateStudent(student);
//		System.out.println(student.getID()+" Student Updated Successfully...");

		/* Delete Opration */
//		studentDao.deleteStudent(444);
//		System.out.println("Student Deleted Successfully...");

		/* Select Opration(Single) */
//		Student student = studentDao.getStudent(333);
//		System.out.println(student);

		/* Select All Student */
		List<Student> list = studentDao.gatAllStudent();
		for (Student student : list) {
			System.out.println(student);
		}

	}
}
