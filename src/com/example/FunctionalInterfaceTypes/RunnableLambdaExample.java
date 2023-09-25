package com.example.FunctionalInterfaceTypes;
class ThreadDemo implements Runnable{

	@Override
	public void run() {
		System.out.println("Run method");
	}
	
}
public class RunnableLambdaExample {
	public static void main(String...args) {
		
		ThreadDemo t = new ThreadDemo();
		Thread thr = new Thread(t);
		thr.start();
		
		Runnable r = ()->{
			System.out.println("Run called using lambda");
		};
		Thread t1 = new Thread(r);
		t1.start();
		
		
		//using lambda 
		
		Thread t2 = new Thread(()->System.out.println("run method called using lambda"));
		t2.start();
	}
}
