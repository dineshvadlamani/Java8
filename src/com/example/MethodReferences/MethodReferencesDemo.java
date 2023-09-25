package com.example.MethodReferences;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable {
	void print(String msg);
}

public class MethodReferencesDemo {
	public static int addition(int a, int b) {
		return a + b;
	}

	public void display(String msg) {
		System.out.println(msg.toUpperCase());
	}

	public static void main(String... args) {
		// 1.Method reference to static method
		// using lambda expression
		Function<Integer, Double> function = (input) -> Math.sqrt(input);
		System.out.println(function.apply(4));

		// using method reference
		Function<Integer, Double> functionReference = Math::sqrt;
		System.out.println(functionReference.apply(4));

		// lambda expression Bifunction interface to call static method

		BiFunction<Integer, Integer, Integer> bifunctionlambda = (a, b) -> MethodReferencesDemo.addition(a, b);
		System.out.println(bifunctionlambda.apply(10, 20));

		// using method reference
		BiFunction<Integer, Integer, Integer> bifunctionlambdarefernce = MethodReferencesDemo::addition;
		System.out.println(bifunctionlambdarefernce.apply(10, 20));

		// 2.Method reference to an instance method of object
		
		MethodReferencesDemo methodReferencesDemo = new MethodReferencesDemo();
		
		//lambda expression
		Printable p = (msg)->methodReferencesDemo.display(msg);
		p.print("hello dinesh");
		
		//using method reference
		Printable printref = methodReferencesDemo::display;
		printref.print("dinakar");
		
		//3.Return to instance method of an arbitary object
		
		Function<String,String> stringfun = (String input)->input.toLowerCase();
		System.out.println(stringfun.apply("Raju"));
		
		//using method reference
		Function<String,String> stringfunref = String::toLowerCase;
		System.out.println(stringfunref.apply("Ramu"));
		
		
		String[] str = {"A","E","I","O","U","a","e","i","o","u"};
		
		//using lambda
		Arrays.sort(str,(s1,s2)->s1.compareToIgnoreCase(s2));
		
		//using method reference
		Arrays.sort(str,String::compareToIgnoreCase);

		//4.reference to constructor
		List<String> fruits = Arrays.asList("Banana","mango","watermelon","mango");
		Function<List<String>,Set<String>> setfun = (fruitsList)->new HashSet<>(fruitsList);
		System.out.println(setfun.apply(fruits));
		//MethodReference
		Function<List<String>,Set<String>> setfunref = HashSet::new;
		System.out.println(setfunref.apply(fruits));
		
		
	}
}
