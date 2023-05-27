package com.SpringORM;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringORM.Dao.StudentDao;
import com.SpringORM.Entity.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/SpringORM/Config.xml");
		StudentDao dao = (StudentDao) apc.getBean("dao");

		/* Insert Student */
//		Student s1 = new Student(555,"Guarang","Vatva",123456);
//		dao.insertStudent(s1);

		/* Update Student */
//		Student s1 = new Student(555,"Gaurang Dalwadi","Ahmedabad",985421);
//		dao.updateStudent(s1);

		/* Delete Student */
//		Student s1 = new Student(444,"Piyush","Ahmedabad",70466881);
//		dao.deleteStudent(s1);

		/* Single Data Fetch */
//		Student s1 = (Student) dao.getStudentByID(555);
//		System.out.println(s1);

		/* Multiple Data Fetch */
		List<Student> list = dao.getAllStudent();
		System.out.println(list);

	}
}
