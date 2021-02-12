package com.dnyanesh.exceptionhandling;

public class InvalidAgeException1 extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	InvalidAgeException1() {
		super("Age is Invalid For Merrage");
		System.out.println("Dnyaneshwar DAke");
		//System.out.println("Not elgible for Marriage / by zero..");
	}
}
