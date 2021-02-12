package com.dnyanesh.list;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsList {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i <5; i++) {
			al.add(i);
		
		}
		System.out.println(al);
		remove(al);
		System.out.println("removed");
		System.out.println(al);
	}
	private static void remove(List<Integer> numbers) {
		for(int i =0 ; i<numbers.size();i++){
			numbers.remove(i);
			remove(numbers);
			break;
		}
	}
}
