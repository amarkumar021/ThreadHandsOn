package com.amar.learn.function;

import java.util.function.Function;

public class FunctionMain {

	public static void main(String[] args) {

		String str = "Hey Piyu";
		Function<String, Integer> calLength = strInput -> {
			int count = 0;
			if (strInput.contains(" "))
				count++;
			return count;
		};
		System.out.println(calLength.apply(str));
	}

}
