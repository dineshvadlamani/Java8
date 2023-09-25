package com.example.lambda;

interface Addable {
	int addition(int a, int b);
}

class AddableImpl implements Addable {

	@Override
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

}

public class LambdaParameters {

	public static void main(String... args) {

		Addable add = (int a, int b) -> (a + b);
		int result = add.addition(10, 20);
		System.out.println(result);	
		Addable ad = (int a,int b)->{
			int c = a+b;
			return c;
		};
		System.out.println(ad.addition(30,40));
	}

}
