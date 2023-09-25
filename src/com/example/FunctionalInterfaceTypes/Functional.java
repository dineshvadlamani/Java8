package com.example.FunctionalInterfaceTypes;

import java.util.function.Function;

class FunctionalImpl implements Function<String, Integer> {

	@Override
	public Integer apply(String t) {
		// TODO Auto-generated method stub
		return t.length();
	}

}

public class Functional {
	public static void main(String... args) {

		Function<String, Integer> f = new FunctionalImpl();
		int result = f.apply("dinesh");
		System.out.println(result);

		// lambda implementation
		Function<String, Integer> func = (String t) -> t.length();
		int result1 = func.apply("dinesh");
		System.out.println(result1);

	}
}
