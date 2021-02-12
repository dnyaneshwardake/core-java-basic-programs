package com.dnyanesh.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue q = new LinkedList();
		q.add(25);
		q.add(27);
		q.add(14);
		q.add(50);
	
		System.out.println(q);
		System.out.println("Remove: "+q.poll());
		System.out.println("Remove: "+q.remove());
		System.out.println(q);
		System.out.println(q.offer(14));
		System.out.println("Head: "+q.peek());
		System.out.println("Head: "+q.element());
		System.out.println(q);
	}

}
