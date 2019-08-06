package com.amar.learn;

import java.util.concurrent.Callable;

public class CallableClass implements Callable<Integer> {

	private int num;

	public CallableClass(int num) {
		super();
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println("Callable Method");
		int sum = 0;
		for (int i = 1; i < num; i++) {
			sum = sum + i; 
		}
		return sum;
	}

}
