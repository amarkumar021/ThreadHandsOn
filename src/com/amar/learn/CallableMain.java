package com.amar.learn;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CallableClass[] callableClass = { new CallableClass(10), 
											new CallableClass(20),
											new CallableClass(30), 
											new CallableClass(40)
		};
		
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (CallableClass c: callableClass) {
			Future<Integer> future = service.submit(c);
			System.out.println(future.get());
		}
		
	}

	
	
	
}
