package com.dnyanesh.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo
{
	public static void main(String[] args)
	{
		HashMap hm = new HashMap();
		hm.put("dake", 10);
		hm.put("dnyanesh", 100);
		hm.put("dharmaraj", 1000);
		hm.put("narmada", 10000);
		hm.put("gokul", 500);
		int i = (Integer) hm.put("dake", 200);
		System.out.println("Value: " + i);
		System.out.println(hm);
		System.out.println(hm.put("gokul", 700)); // returns the replaced value
		Set s = hm.keySet();
		System.out.println(s);
		Collection c = hm.values();
		System.out.println(c);
		Set s1 = hm.entrySet();
		Iterator itr = s1.iterator();
		while (itr.hasNext())
		{
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.print(m1.getKey() + "...." + m1.getValue() + ",");
			if (m1.getKey().equals("gokul"))
			{
				m1.setValue("800");
			}
		}
		System.out.println();
		// System.out.println(hm);
	}

}
