package com.dake.MultiThreading;

public class RunnableDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("Dake");
	}
	public static void main(String[] args) {
		Thread t = new Thread(new RunnableDemo());
		Thread t1 = new Thread(new RunnableDemo());
		t.start();
		t1.start();
	}

}
