package com.example.Concurrency;

import java.util.concurrent.Callable;

public class CallablesAndFutureExample {
	public static void main(String...args) {
	//In addition to Runnable executors support another kind of task named Callable. Callables are functional interfaces just like runnables 
	//but instead of being void they return a value
	Callable<Integer> task = ()->{
		return 123;
	};
  }
	
}
