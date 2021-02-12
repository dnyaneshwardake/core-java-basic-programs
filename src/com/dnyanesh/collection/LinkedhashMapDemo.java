package com.dnyanesh.collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedhashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(1, "Dake");
		lhm.put(10, "DDDD");
		lhm.put(2, "Dnyanesh");
		lhm.put(3, "Dharma");
		lhm.put(7, "aaaa");
		
		Set s = lhm.entrySet();
		Iterator itr = s.iterator();
		
		System.out.println(lhm);
		
	}

}
