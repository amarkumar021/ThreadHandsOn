package com.amar.learn.suplier;

import java.util.function.Supplier;

public class SuplierMain {

	public static void main(String[] args) {
		Supplier<Double> randomNumber = () -> Math.random(); 
		
		System.out.println(randomNumber.get());
	}

}
