package com.ReferanceType;

public class Person {
	private int ID;
	private String Name;
	private Address address;

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [ID=" + ID + ", Name=" + Name + ", address=" + address + "]";
	}

}
