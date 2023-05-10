package com.SpringLifecycles;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext apc = new ClassPathXmlApplicationContext("com/SpringLifecycles/Lifecycle.xml");
		apc.registerShutdownHook();
		
		// Lifecycle Through XML 
		//Samosa s1 = (Samosa) apc.getBean("s1");
		//System.out.println(s1);
		
		// Lifecycle Through Interface
		//Pepsi p1 = (Pepsi) apc.getBean("p1");
		//System.out.println(p1);
		
		// Lifecycle Through Annotation
		Dhosa d1 = (Dhosa) apc.getBean("d1");
		System.out.println(d1);
	}
}
