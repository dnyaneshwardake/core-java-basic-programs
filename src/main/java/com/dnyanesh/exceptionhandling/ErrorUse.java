package com.dnyanesh.exceptionhandling;

public class ErrorUse {
	public static void main(String[] args) {
		try {
			throw new Error();
		} catch (Error e) {
			System.out.println("Error Catched");
		} finally {
			System.out.println("Finally...");
		}

	}

}
