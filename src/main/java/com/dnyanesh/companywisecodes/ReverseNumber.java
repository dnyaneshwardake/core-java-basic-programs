package com.dnyanesh.companywisecodes;

public class ReverseNumber
{

	static void reverseNumber(int number)
	{
		if (number < 10)
		{
			System.out.print(number);
			return;
		} else
		{
			System.out.print(number % 10);
			reverseNumber(number / 10);
		}

	}

	public static void main(String[] args)
	{
		int number = 123;
		reverseNumber(number);
	}
}
