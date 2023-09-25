package com.example.Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsExample  {

	public static void main(String...args) {
		/*
		 * Runnable r = ()->{ System.out.println(Thread.currentThread().getName()); };
		 * r.run(); Thread t = new Thread(r); t.start();
		 */
		
		//Executors contains pool of threads where there is no necessity to create new threads
		ExecutorService ex = Executors.newSingleThreadExecutor();
		ex.execute(()->{
			System.out.println(Thread.currentThread().getName());
		});
		
		try {
			System.out.println("Shutdown the tasks");
			ex.shutdown();
			ex.awaitTermination(5, TimeUnit.SECONDS);
		}
		catch (Exception e) {
		    System.err.println("tasks interrupted");
		}
		finally {
			if(!ex.isTerminated()) {
				 System.err.println("cancel non-finished tasks");
			}
			 	ex.shutdownNow();
			    System.out.println("shutdown finished");
		}
		
	}
}
