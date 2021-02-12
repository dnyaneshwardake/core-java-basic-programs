package com.dnyanesh.exceptionhandling;

import java.util.Scanner;

public class TestShriThrowKeyword
{
	void status(int age) throws InvalidAgeException
	{
		if (age > 20)
		{
			System.out.println("Eligible for marriage..");

		} else
		{
			throw new InvalidAgeException();
		}
	}

	public static void main(String[] args) throws InvalidAgeException
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the age : ");
		int age = scanner.nextInt();
		new TestShriThrowKeyword().status(age);
		scanner.close();
	}
}
