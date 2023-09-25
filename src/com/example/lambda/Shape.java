package com.example.lambda;

public interface Shape {
	void draw();
	default void m1() {
		System.out.println("m1 default method");
	}
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle interface");
	}

}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square interface");
	}

}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle interface");
	}
}
