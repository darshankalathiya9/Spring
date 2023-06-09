package com.FullyAnnotation_RemoveXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.FullyAnnotation_RemoveXML")
public class JavaConfig {

	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}

	@Bean
	public Student getStudent() {

		// Creating a New Student Object
		Student s1 = new Student(getSamosa());

		return s1;
	}
}
