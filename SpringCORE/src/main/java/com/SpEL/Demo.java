package com.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	// Primitive Datatypes
	@Value("#{11+22}")
	private int X;

	// Ternary Operators
	@Value("#{8>6?88:55}")
	private int Y;

	// Static Method
	@Value("#{ T(java.lang.Math).sqrt(25)}")
	private double Z;

	// Variable
	@Value("#{ T(java.lang.Math).PI}")
	private double pi;

	// Object
	@Value("#{ new java.lang.String ('DARSHAN KALATHIYA') }")
	private String name;

	// Boolean
	@Value("#{8>3}")
	private boolean isActive;

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

	public double getZ() {
		return Z;
	}

	public void setZ(double z) {
		Z = z;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Demo [X=" + X + ", Y=" + Y + ", Z=" + Z + ", pi=" + pi + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

}
