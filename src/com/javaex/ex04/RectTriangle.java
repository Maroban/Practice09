package com.javaex.ex04;

public class RectTriangle extends Shape {

	private double width;
	private double height;

	public RectTriangle() {
	}

	public RectTriangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public double getPerimeter() {  // 둘레 공식
		return width + height + (Math.sqrt((width * width) + (height * height)));
	}

	public double getArea() {  // 넓이 공식
		return (width * height) * 0.5;
	}

}
