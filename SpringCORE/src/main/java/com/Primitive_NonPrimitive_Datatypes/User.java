package com.Primitive_NonPrimitive_Datatypes;

public class User {
	private int ID;
	private String Name;
	private long Contact;

	public User() {
		super();
	}

	public User(int iD, String name, long contact) {
		super();
		ID = iD;
		Name = name;
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

	public long getContact() {
		return Contact;
	}

	public void setContact(long contact) {
		Contact = contact;
	}

	@Override
	public String toString() {
		return "User [ID=" + ID + ", Name=" + Name + ", Contact=" + Contact + "]";
	}

}
