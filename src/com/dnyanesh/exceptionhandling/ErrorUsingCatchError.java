package com.dnyanesh.exceptionhandling;

public class ErrorUsingCatchError {
	
	public static void main(String[] args) {
		try {
			throw new Error();
		} catch (Error e) {
			System.out.println("Error catched...");
		} finally {
			System.out.println("Finally...");
		}
	}

}
