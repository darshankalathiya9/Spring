package com.Standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/Standalone/Standalone.xml");
		Person p1 = (Person) apc.getBean("p1");
		System.out.println(p1);
		
		System.out.println(p1.getFriends());
		System.out.println(p1.getFriends().getClass().getName());
		System.out.println(p1.getFees());
		System.out.println(p1.getFees().getClass().getName());
		System.out.println(p1.getProps());
		System.out.println(p1.getProps().getClass().getName());
	}
}
