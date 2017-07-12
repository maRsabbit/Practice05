package com.javaex.problem04;

public abstract class Shape {
	private int countSides;
	public Shape(int countSides) {
		this.countSides = countSides;
	}
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	public int getCountSides() {
		return countSides;
	}
	public void setCountSides(int countSides) {
		this.countSides = countSides;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
}
