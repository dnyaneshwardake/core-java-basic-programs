package com.dnyanesh.fang.codes;

import java.util.Scanner;

public class FiboSeries {
	public static void main(String[] args){
		int n=0;
		System.out.println("Enter Fibo series up to: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[] = new int[n];
		a[1]=1;
		for(int i=2;i<n;i++){
			a[i] = a[i-1] + a[i-2];
		}
		System.out.println("Fibonacci Series upto " +n);
		for(int i=0; i< n; i++){
			System.out.print(" "+a[i]);
		}
	}
	}
