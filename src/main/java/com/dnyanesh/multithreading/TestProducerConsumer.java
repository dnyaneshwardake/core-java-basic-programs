package com.dnyanesh.multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TestProducerConsumer {
	public static void main(String args[]){

		//Creating shared object
		BlockingQueue sharedQueue = new LinkedBlockingQueue();

		//Creating TestProducer and TestConsumer Thread
		Thread prodThread = new Thread(new TestProducer(sharedQueue));
		Thread consThread = new Thread(new TestConsumer(sharedQueue));

		//Starting TestProducer and TestConsumer thread
		prodThread.start();
		consThread.start();
	}
}

//TestProducer Class in java
class TestProducer implements Runnable {
	private final BlockingQueue sharedQueue;
	public TestProducer(BlockingQueue sharedQueue) {
		this.sharedQueue = sharedQueue;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			try {
				System.out.println("Produced: " + i);
				sharedQueue.put(i);
			} catch (InterruptedException ex) {
				System.out.println("Producer issue");
			}
		}
	}
}

//TestConsumer Class in Java
class TestConsumer implements Runnable{
	private final BlockingQueue sharedQueue;
	public TestConsumer (BlockingQueue sharedQueue) {
		this.sharedQueue = sharedQueue;
	}
	@Override
	public void run() {
		while(true){
			try {
				System.out.println("Consumed: "+ sharedQueue.take());
			} catch (InterruptedException ex) {
				System.out.println("Consumer issue");
			}
		}
	}
}