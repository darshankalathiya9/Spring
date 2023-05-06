package com.CollectionType;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class User {
	private int ID;
	private String Name;
	private List<String> Contact;
	private Set<String> Address;
	private Map<Integer, String> Account;

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

	public List<String> getContact() {
		return Contact;
	}

	public void setContact(List<String> contact) {
		Contact = contact;
	}

	public Set<String> getAddress() {
		return Address;
	}

	public void setAddress(Set<String> address) {
		Address = address;
	}

	public Map<Integer, String> getAccount() {
		return Account;
	}

	public void setAccount(Map<Integer, String> account) {
		Account = account;
	}

	@Override
	public String toString() {
		return "User [ID=" + ID + ", Name=" + Name + ", Contact=" + Contact + ", Address=" + Address + ", Account="
				+ Account + "]";
	}

}
