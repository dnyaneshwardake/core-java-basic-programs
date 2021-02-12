package com.dnyanesh.collection;

import java.util.ArrayList;
import java.util.Collections;

class CollectionArrayList
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Intial Size of AL:" + al.size());
		al.add("C");
		al.add("A");
		al.add("D");
		al.add("P");
		// al.add(5);
		// al.add(null);
		// al.add(" ");
		al.add(3, "DAKE");
		// al.remove(null);
		System.out.println(al.add("Z"));
		al.add("24");
		System.out.println("Size of AL After Addition: " + al.size());
		System.out.println("Contents of AL:" + al);
		System.out.println("dddd" + al.remove("hjjj"));
		al.remove(2);
		System.out.println(al.contains("D"));
		Collections.sort(al);
		System.out.println(al);
		System.out.println("Size of AL After Deletion: " + al.size());
		System.out.println("Content of AL:" + al);

	}
}