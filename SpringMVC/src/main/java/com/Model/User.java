package com.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	private String Name, Address, Email, Password;
	private long Contact;

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

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public long getContact() {
		return Contact;
	}

	public void setContact(long contact) {
		Contact = contact;
	}

	@Override
	public String toString() {
		return "User [ID=" + ID + ", Name=" + Name + ", Address=" + Address + ", Email=" + Email + ", Password="
				+ Password + ", Contact=" + Contact + "]";
	}

}
