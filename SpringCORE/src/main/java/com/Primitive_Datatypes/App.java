package com.Primitive_Datatypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/Primitive_Datatypes/Primitive_Datatype.xml");
		User u1 = (User) apc.getBean("u1");
		System.out.println(u1);
		User u2 = (User) apc.getBean("u2");
		System.out.println(u2);
	}
}
