package com.FullyAnnotation_RemoveXML;

import org.springframework.stereotype.Component;

//@Component("student")
public class Student {

	private Samosa samosa;

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public void study() {
		this.samosa.Display();
		System.out.println("Student Reading Book.");
	}
}
