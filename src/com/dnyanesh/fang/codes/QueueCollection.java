package com.dnyanesh.fang.codes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class QueueCollection {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.offer(40);
		
		System.out.println(q.poll());
		
		System.out.println(q.peek());
		
		//System.out.println(q);
		//System.out.println(q.size());
		
		for(int i=1; i<=5; i++) {
			System.out.println(" "+q.offer(i));
		}
		System.out.println(q);
		
		Iterator<Integer> itr = q.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}
	}
}
