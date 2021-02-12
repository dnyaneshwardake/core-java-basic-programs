package com.dnyanesh.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo
{
	static int[] arrayList = new int[50];

	public static void main(String[] args)
	{
		final List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		for (int i = 11; i < 20; i++)
		{
			al.add(i);
		}
		al.add(5, 25);
		al.add(55);
		System.out.println(al.get(1));
		System.out.print(al);
		System.out.println();

		for (int i = 0; i < al.size(); i++)
		{
			System.out.print(al.remove(i) + " ");
			// arrayList[i] = al.get(i);
		}
		System.out.println("Finale List: " + al);
	}
}
