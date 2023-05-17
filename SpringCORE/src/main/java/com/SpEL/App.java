package com.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/SpEL/SpEL.xml");
		Demo s1 = apc.getBean("demo", Demo.class);
		System.out.println(s1);
	}
}
