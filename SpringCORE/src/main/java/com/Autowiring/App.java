package com.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
	ApplicationContext apc = new ClassPathXmlApplicationContext("com/Autowiring/Autowire.xml");
	Employee e1 = (Employee) apc.getBean("e1");
	System.out.println(e1);
}
}
