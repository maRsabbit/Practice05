package com.javaex.problem04;

public class Rectangle extends Shape implements Resizeable{
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		// TODO Auto-generated constructor stub
		this.width=width;
		this.height=height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (width*height);
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (width+height)*2;
	}
	
	public void resize(double s) {
		width = width*s;
		height = height*s;
	}
}
