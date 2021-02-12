package com.dnyanesh.fang.codes;

public class Queue {
	int[] object;
	int front;
	int rear;
	int queueSize;
	
	public Queue(){
		queueSize = 3;
		front = -1;
		rear = -1;
		object = new int[queueSize];
	}
	
	public void push(int data){
		if((front+1)>=queueSize)
			resize();
		object[++front] = data;		
	}	
	
	public Integer pop(){
		if(front > rear)
			return object[++rear];
		return null;
	}
	
	public boolean isEmpty(){
		return front <= rear;
	}
	
	private void resize(){
		int[] temp = object;
		queueSize = queueSize*2;
		object = new int[queueSize];
		
		for(int i=0; i<=front; i++)
			object[i] = temp[i];
	}
	
	public static void main(String[] args){
		
		System.out.println(System.currentTimeMillis());
		
		Queue q = new Queue();
		q.push(5);
		q.push(7);
		q.push(4);
		System.out.println(q.pop());
		q.push(6);
		q.push(-5);
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		
		System.out.println(q.pop());
		
		System.out.println(System.currentTimeMillis());
	}
}
