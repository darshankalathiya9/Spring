package com.SpringORM.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int ID;
	private String Name;
	private String City;
	private long Contact;

	public Student() {
		super();
	}

	public Student(int iD, String name, String city, long contact) {
		super();
		ID = iD;
		Name = name;
		City = city;
		Contact = contact;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public long getContact() {
		return Contact;
	}

	public void setContact(long contact) {
		Contact = contact;
	}

	@Override
	public String toString() {
		return "Student [ID=" + ID + ", Name=" + Name + ", City=" + City + ", Contact=" + Contact + "]";
	}

}
