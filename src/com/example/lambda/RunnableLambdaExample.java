package com.example.lambda;

class ThreadDemo implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run method is called");
	}
}

public class RunnableLambdaExample {

	public static void main(String... args) {
		Thread thread = new Thread(new ThreadDemo());
		thread.start();
		
		Runnable r = ()->{
			System.out.println("run method is called");
		};
		
		Thread threadlambda = new Thread(r);
		threadlambda.start();
		
		Thread threadlambda1 = new Thread(()->System.out.println("Run method called using lambda"));
		threadlambda1.start();
	}
}
