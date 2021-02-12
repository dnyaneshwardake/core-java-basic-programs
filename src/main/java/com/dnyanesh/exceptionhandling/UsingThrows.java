package com.dnyanesh.exceptionhandling;

public class UsingThrows {
	public static void main(String[] args) {
		try {
			System.out.println(10/2);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Catch Excuted");
		}
	}
}
