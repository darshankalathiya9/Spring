package com.ReferanceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/ReferanceType/Reference.xml");
		Person p1 = (Person) apc.getBean("p1");
		System.out.println(p1);
	}
}
