package com.dnyanesh.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class TestComparator {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 1; i < 10 ; i++) {
			al.add(i);
		}
		TreeSet<Integer> t = new TreeSet<Integer>(new SpecialComp());
		t.add(15);
		t.add(12);
		t.addAll(al);
		t.add(12);
		t.add(4);
		t.add(8);
		t.add(8);
		t.add(22);
		/*Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			t.add((int)itr.next());
		}*/
		System.out.println(t);
	}
}
class SpecialComp implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Integer I1 = (Integer)o1;
		Integer I2 = (Integer)o2;
		//return I1.compareTo(I2);	// 1. default natural sorting
		//return -I1.compareTo(I2);	// 2. descending order
		//return I2.compareTo(I1);	// 3. descending order
		//return -I2.compareTo(I1);	// 4. ascending order
		return +1;				// 5. o/p will as per insertion order
		//return -1;				// 6. o/p will be reverse of insertion order
		//return 0;					// 7. only one element will be inserted,
	}								// other will be treated as duplicate								
}

