package com.dnyanesh.multithreading;

class MyNewThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		System.out.println("Line Excuted By :"+Thread.currentThread().getName());
		Thread.currentThread().setName("New"+Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
	}
}
class TestNewThread {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyNewThread t = new MyNewThread();
		t.start();
		MyNewThread t1 = new MyNewThread();
		t1.start();
		System.out.println(t.getName());
		System.out.println(t1.getName());
		Thread.currentThread().setName("DNAYNESH");
		System.out.println(Thread.currentThread().getName());
	}
}