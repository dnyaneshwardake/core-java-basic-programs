package com.dnyanesh.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreesetWithComparator
{
	public static void main(String[] args)
	{
		TreeSet<Integer> t = new TreeSet<Integer>(new MyNewComparator());
		t.add(15);
		t.add(12);
		t.add(4);
		t.add(8);
		t.add(8);
		t.add(22);
		System.out.println(t);
	}
}

class MyNewComparator implements Comparator
{
	@Override
	public int compare(Object o1, Object o2)
	{
		Integer I1 = (Integer) o1;
		Integer I2 = (Integer) o2;
		// return I1.compareTo(I2); // 1. default natural sorting
		// return -I1.compareTo(I2); // 2. descending order
		// return I2.compareTo(I1); // 3. descending order
		// return -I2.compareTo(I1); // 4. ascending order
		// return +1; // 5. o/p will as per insertion order
		return -1; // 6. o/p will be reverse of insertion order
		// return 0; // 7. only one element will be inserted,
	} // other will be treated as duplicate
}
