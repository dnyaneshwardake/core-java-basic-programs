package com.dnyanesh.collection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrrentHashMapDemo
{
	public static void main(String[] args)
	{
		ConcurrentHashMap chm = new ConcurrentHashMap();
		chm.put(100, "A");
		chm.put("dd", 10);

		for (int i = 1; i < 10; i++)
		{
			chm.put(i, "New" + i);
		}
		System.out.println(chm);
	}

}
