package com.dnyanesh.fang.codes;

import java.util.LinkedList;
import java.util.Deque;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		//Deque d = new LinkedList();
		ll.addFirst(00);
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(30);
		ll.remove(4);
		ll.add(40);
		ll.add(50);
		ll.addFirst(12);
		ll.addLast(15);
		System.out.println(ll);
		System.out.println(ll.size());
	}
}