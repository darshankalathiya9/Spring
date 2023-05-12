package com.StereotypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/StereotypeAnnotations/Stereotype_Annotation.xml");
		Student s1 = (Student) apc.getBean("student",Student.class);
		System.out.println(s1);
		System.out.println(s1.getMobile().getClass().getName());
	}
}
