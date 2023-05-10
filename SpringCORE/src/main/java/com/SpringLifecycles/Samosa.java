package com.SpringLifecycles;

public class Samosa {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Samosa(int price) {
		super();
		this.price = price;
	}
	
	

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	
	public void init() {
		System.out.println("Inside Init Method.");
	}
	
	public void destroy() {
		System.out.println("Inside Destroy Method.");
	}

}
