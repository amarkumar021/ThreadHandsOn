package com.amar.learn;

public class DeadlockThread {

	public static void main(String[] args) {
		
		Thread m = Thread.currentThread();
		
		Thread t1 = new Thread(() -> {try {
			System.out.println("Thread-t1");
			m.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}});
		
		t1.start();
		
		try {
			System.err.println("Thread-main");
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Ends Main Thread");
	}

}
