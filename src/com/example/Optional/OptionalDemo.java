package com.example.Optional;

import java.util.Optional;

public class OptionalDemo {
	public static void main(String... args) {
		// of,empty,ofNullable

		String email = "dinesh@gmail.com";
		Optional<Object> optional = Optional.empty();
		System.out.println(optional);

		// Of gives null pointer exception if value is not present
		Optional<String> emailOptional = Optional.of(email);
		System.out.println(emailOptional);

		// ofNullable gives empty value if no value is present
		Optional<String> stringOptional = Optional.ofNullable(email);

		String defaultOption = stringOptional.orElse("default@gmail.com");

		System.out.println(defaultOption);

		String defaultOptinal2 = stringOptional.orElseGet(() -> "default@gmail.com");
		System.out.println(defaultOptinal2);

		String defaultOptional3 = stringOptional.orElseThrow(() -> new IllegalArgumentException("email dont exist"));

		System.out.println(defaultOptional3);

		// ifPresent
		Optional<String> gender = Optional.of("Male");
		Optional<String> emptyOptional = Optional.empty();

		gender.ifPresent((s) -> System.out.println("value is present"));
		emptyOptional.ifPresent((s) -> System.out.println("no value is present"));
		if (stringOptional.isPresent()) {
			System.out.println(stringOptional.get());
		} else {
			System.out.println("no value present");
		}

		// filter method
		String result = "abc";
		if (result != null && result.contains("abc")) {
			System.out.println(result);
		}
		
		Optional<String> opObj = Optional.of(result);
		opObj.filter(res->res.contains("abc"))
				.map(String::trim)
				.ifPresent(res->System.out.println(res));
	}
}
