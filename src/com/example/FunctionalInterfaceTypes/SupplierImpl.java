package com.example.FunctionalInterfaceTypes;

import java.time.LocalDateTime;
import java.util.function.Supplier;

class SupplierDemo implements Supplier<LocalDateTime> {

	public LocalDateTime get() {
		return LocalDateTime.now();
	}
}

public class SupplierImpl {

	public static void main(String...args) {
	Supplier<LocalDateTime> supplier = new SupplierDemo();
	System.out.println(supplier.get());
	
	//using lambda
	Supplier<LocalDateTime> local = ()->LocalDateTime.now();
	System.out.println(local.get());
	}
}
