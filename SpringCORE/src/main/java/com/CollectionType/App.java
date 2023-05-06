package com.CollectionType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/CollectionType/CollectionType.xml");
		User u1 = (User) apc.getBean("u1");
		System.out.println(u1);
	}
}
