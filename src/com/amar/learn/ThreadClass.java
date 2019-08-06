package com.amar.learn;

public class ThreadClass extends Thread{

	static Thread mt;
	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Child Thread");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//System.out.println("Thread Class Run" + Thread.currentThread().getName());
		}
	}
}
