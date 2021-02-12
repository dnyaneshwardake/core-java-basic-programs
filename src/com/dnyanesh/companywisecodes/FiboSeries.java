package com.dnyanesh.companywisecodes;

public class FiboSeries
{
	public static void main(String[] args)
	{
		long n = 5;
		long a = 0, b = 1, c;
		while (n >= 0)
		{
			c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
			n--;
		}
	}
}
