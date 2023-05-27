package com.SpringORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringORM.Dao.StudentDao;
import com.SpringORM.Entity.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/SpringORM/Config.xml");
		StudentDao dao = (StudentDao) apc.getBean("dao");
		
		/* Insert Student */
		Student s1 = new Student(333,"Tirthu","Ahmedabad",898035079);
		dao.insertStudent(s1);
	}
}
