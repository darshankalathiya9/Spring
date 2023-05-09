package com.Constructor_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
	ApplicationContext apc = new ClassPathXmlApplicationContext("com/Constructor_Injection/Constructor_Injection.xml");
	User u1 = (User) apc.getBean("u1");
	System.out.println(u1);
	}
}
