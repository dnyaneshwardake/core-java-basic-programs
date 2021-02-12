package com.dnyanesh.exceptionhandling;

import java.io.IOException;

public class UsingThrowKeyword1 {

	 void m1() throws InterruptedException {
		System.out.println("Sleeping mode..1");
		Thread.sleep(3000);
		System.out.println("Sleeping mode..2");
	}
	 void m2() throws InterruptedException {
		m1();
	}
	 void m3() {
		try {
			m2();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		new UsingThrowKeyword1().m3();
	}

}
