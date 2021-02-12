package com.dnyanesh.fang.codes;

public class Stack {
	int[] A = new int[5];
	int top=-1;
	public void push(int x){
		if(top == A.length-1) {
			System.out.println("Stack is full....");
			return;
		}
		top++;
		A[top] = x;
	}
	public void pop(){
		if(top==-1) {
			System.out.println("Stack is already empty...");
			return;
		}
		top--;
	}
	
	public int top(){
		return top;
	}
	public void print(){
		for(int i=0; i<=top; i++) {
			System.out.println(" "+A[i]);
		}
	}
	public static void  main(String[] args){
		Stack s = new Stack();
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.push(7);
		s.pop();
		s.print();
	}

}
