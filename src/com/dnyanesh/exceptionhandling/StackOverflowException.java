package com.dnyanesh.exceptionhandling;

public class StackOverflowException {
	public static void m1() {
		System.out.println("Mentod-1");
		m2();
	}
	public static void m2() {
		System.out.println("Mentod-2");
		m1();
	}
	public static void main(String[] args) {
		m1();
	}
}
