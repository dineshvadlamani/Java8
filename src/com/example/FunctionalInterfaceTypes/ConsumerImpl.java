package com.example.FunctionalInterfaceTypes;

import java.util.function.Consumer;

class ConsumerDemo implements Consumer<String> {
	// Consumer takes string as input and returns void
	public void accept(String input) {
		System.out.println(input.length());
	}

}

public class ConsumerImpl {
	public static void main(String... args) {
		//using lambda function
		Consumer<String> c = (String s) -> System.out.println(s.length());
		c.accept("dinakar");

	}
}
