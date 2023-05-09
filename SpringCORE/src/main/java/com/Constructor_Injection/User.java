package com.Constructor_Injection;

/*public class User {
	private int ID;
	private String Name;
	private double per;

	public User() {
		super();
	}

	public User(int iD, String name, double per) {
		super();
		ID = iD;
		Name = name;
		this.per = per;
		System.out.println("Set a Value by Defualt Constructor Arguments.");
	}

	public User(String iD, String name, String per) {
		super();
		ID = Integer.parseInt(iD);
		Name = name;
		this.per = Double.parseDouble(per);
		System.out.println("Set a Value by String Constructor Arguments.");
	}

	@Override
	public String toString() {
		return "User [ID=" + ID + ", Name=" + Name + ", per=" + per + "]";
	}
}*/

public class User{
	private int A;
	private int B;
	private int C;
	
	public User() {
		super();
	}

	public User(int a, int b, int c) {
		super();
		A = a;
		B = b;
		C = c;
	}

	@Override
	public String toString() {
		return "User [A=" + A + ", B=" + B + ", C=" + C + "]";
	}
}
