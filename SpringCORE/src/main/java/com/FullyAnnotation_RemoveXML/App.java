package com.FullyAnnotation_RemoveXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext apc = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		// Student s1 = (Student) apc.getBean("student", Student.class);
		Student s1 = (Student) apc.getBean("getStudent", Student.class);
		
		System.out.println(s1);
		
		s1.study();
	}
}
