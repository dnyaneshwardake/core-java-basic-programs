package com.dnyanesh.companywisecodes;

public class PrimeNumber01to50
{
	public static void main(String[] args)
	{
		int n = 50;
		int count = 0;
		for (int i = 1; i < n; i++)
		{
			count = 0;
			for (int num = 1; num <= n; num++)
			{
				if ((i % num) == 0)
				{
					count++;
				}
			}
			if (count == 2)
			{
				// System.out.println("Prime Number" + i);
			} // else System.out.println("Not Prime");
		}

		String s = "d";
		String s1 = new String("d");

		int a = 10;
		System.out.println(s.hashCode() + "---" + s1.hashCode());

	}
}
