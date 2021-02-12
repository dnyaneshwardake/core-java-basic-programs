package com.dake.MultiThreading;

class NewLogic extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
}

public class ThresdPrioritiesDemo {
	public static void main(String[] args) throws InterruptedException {
		NewLogic t = new NewLogic();
		t.start();
		Thread.currentThread().sleep(100);
		for (int i = 6; i <= 10; i++) {
			System.out.println(i);
		}
		
	}
}
