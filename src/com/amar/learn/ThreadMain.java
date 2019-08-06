package com.amar.learn;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {
		/*System.out.println(Thread.currentThread().getName());
		ThreadClass threadClass = new ThreadClass();
		System.out.println(threadClass.getName());
		threadClass.start();
		Thread.currentThread().setName("Fuur");
		System.out.println(threadClass.getPriority());
		System.out.println(Thread.currentThread().getPriority());*/
		
		/*Thread t1 = new Thread( () -> {
			for(int i = 0; i < 10; i++) {
			System.out.println("Thread-one");
			}});
		Thread t2 = new Thread( () -> {
			for(int i = 0; i < 10; i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread-two");
				};});*/
		
		//ThreadClass t1 = new ThreadClass();
		//ThreadClass t2 = new ThreadClass();
		//ThreadClass t3 = new ThreadClass();
		
		/*ThreadClass.mt = Thread.currentThread();
		t1.start();
		System.out.println("going into Deadlock");
		Thread.currentThread().join();
		//t1.join();
		//t1.join();
		//t2.start();
		//t2.join();
		//t3.start();	
		//t3.join();
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Main Thread");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Ends Main");*/
		
		//Thread t = new Thread
												
		ThreadGroup threadGroup1 = new ThreadGroup("MyThreadGroup");
		System.out.println(threadGroup1.getParent().getName());
		
		ThreadGroup threadGroup2 = new ThreadGroup(threadGroup1,"second ThreadGroup");
		System.out.println(threadGroup2.getParent().getName());
		//ThreadGroup threadGroup = new ThreadGroup("MyThreadGroup");
		
		 		
	}

}
