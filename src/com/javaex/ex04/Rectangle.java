package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {

	private double width;
	private double height;

	public Rectangle() {
	}

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public void resize(double s) {  // 크기 수정
		width = width * s;
		height = height *s;
	}

	public double getPerimeter() {  // 둘레 공식
		return (width + height) * 2;
	}

	public double getArea() {  // 넓이 공식
		return width * height;
	}
}
