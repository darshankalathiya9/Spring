package com.StereotypeAnnotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("DK")
	private String name;
	@Value("Bhavnagar")
	private String city;
	@Value("#{mobiles}")
	private List<String> mobile;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getMobile() {
		return mobile;
	}

	public void setMobile(List<String> mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", mobile=" + mobile + "]";
	}

}
