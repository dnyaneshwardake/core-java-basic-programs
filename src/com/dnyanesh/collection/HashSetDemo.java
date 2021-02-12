package com.dnyanesh.collection;

import java.util.HashSet;

public class HashSetDemo
{
	public static void main(String[] args)
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 10; i > 1; i--)
		{
			hs.add(i);
		}
		System.out.println(hs);

		System.out.println(hs.add(5));
	}

}
