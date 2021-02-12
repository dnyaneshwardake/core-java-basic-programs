package com.dnyanesh.collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableDemo
{
	public static void main(String[] args)
	{
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("a", "dake");
		ht.put("b", "dnyanesh");
		ht.put("c", "dharmarj");
		ht.put("d", "narmada");
		ht.put("e", "gokul");
		System.out.println(ht.replace("a", "dake1"));
		System.out.println(ht.put("d", "sdgf"));
		Set s = ht.entrySet();
		Iterator itr = s.iterator();
		while (itr.hasNext())
		{
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.print(m1.getKey() + ".." + m1.getValue() + ", ");
			if (m1.getKey().equals("c"))
			{
				m1.setValue("dharma");
			}

		}
		System.out.println();
		System.out.print(ht + " ,");

	}

}
