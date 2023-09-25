package com.example.lambda;

public class LambdaExample {

	public static void print(Shape shape) {
		shape.draw();
	}
	public static void main(String... args) {
	
		String s = "dinesh";
		Shape rectangle = () -> System.out.println("Rectangle class is called");
		rectangle.draw();
		Shape square = () -> System.out.println("Square is called");
		square.draw();
		
		print(rectangle);
		print(square);
		
		print(() -> System.out.println("Rectangle class is called"));
		print(()->System.out.println("Square is called"));
		
	}
}
