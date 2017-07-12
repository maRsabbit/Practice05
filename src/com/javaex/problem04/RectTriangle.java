package com.javaex.problem04;

public class RectTriangle extends Shape{
	private double width;
	private double height;
	
	public RectTriangle(double width, double height) {
		// TODO Auto-generated constructor stub
		this.width=width;
		this.height=height;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (width*height)/2;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		double c = Math.sqrt(width*width+height*height);
		return width+height+c;
	}
	
}
