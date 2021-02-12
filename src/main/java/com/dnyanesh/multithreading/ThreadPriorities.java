package com.dnyanesh.multithreading;

class MyLogic extends Thread {
	
}
class ThreadPriorities {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(17);
		Thread.currentThread().setPriority(7);
		MyLogic t = new MyLogic();
		System.out.println(t.getPriority());
		
	}
}
