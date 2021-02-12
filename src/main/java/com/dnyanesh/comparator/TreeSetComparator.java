package com.dnyanesh.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>(new Mycomparator());
		t.add(15);
		t.add(12);
		t.add(10);
		t.add(8);
		t.add(8);
		t.add(22);
		System.out.println(t);
	}
}
class Mycomparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		if(i1<i2)
			return +1;
		else if (i1>i2)
			return -1;
		else
			return 0;
	}
}

