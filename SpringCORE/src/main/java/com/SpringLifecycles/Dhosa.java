package com.SpringLifecycles;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dhosa {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Dhosa [price=" + price + "]";
	}

	public Dhosa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void Start() {
		System.out.println("Starting Method");
	}
	
	@PreDestroy
	public void End() {
		System.out.println("Ending Method");
	}

}
