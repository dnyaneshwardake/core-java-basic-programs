package com.dnyanesh.collection;

import java.util.ArrayList;

public class ArrayListTravarse
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		for (int i = 0; i < 10; i++)
		{
			al.add(i);
		}
		al.remove(4);

		for (Object i : al)
		{
			al.remove(5);
		}

		System.out.println(al);
	}

}
