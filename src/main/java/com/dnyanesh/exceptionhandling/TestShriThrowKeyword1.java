package com.dnyanesh.exceptionhandling;

import java.util.Scanner;

public class TestShriThrowKeyword1 {

	void status(int age) throws InvalidAgeException1{
		if(age > 20) 
			System.out.println("Eligible for marriage..!!");
		else 
			 throw new InvalidAgeException1();
	}
	public static void main(String[] args)throws InvalidAgeException1 {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		new TestShriThrowKeyword1().status(age);
		sc.close();
	}
}
