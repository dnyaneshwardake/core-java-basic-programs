package com.dake.MultiThreading;

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
}
public class TestThread {
	public static void main(String[] args) throws Exception {
		MyThread t = new MyThread();
		t.start();
		Thread.currentThread().sleep(10);
		System.out.println(Thread.currentThread().getName());
		for (int i = 6; i <= 10; i++) {
			System.out.println(i);
		}
	}
}