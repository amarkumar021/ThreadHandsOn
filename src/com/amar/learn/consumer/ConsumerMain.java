package com.amar.learn.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerMain {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("Amar");
		names.add("Priyanka");
		names.add("Piyu");
		
		Consumer<String> printNames = (name) -> System.out.println(name);
		
		for (String name: names) {
			printNames.accept(name);
		}
	}

}
