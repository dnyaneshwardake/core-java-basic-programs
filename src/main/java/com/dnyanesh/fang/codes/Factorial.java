package com.dnyanesh.fang.codes;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args){
		int n, fact=1;
		System.out.println("Enter number...");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n<0)
			System.out.println("Number should be non-negative");
		else{
			for(int i=1; i<=n; i++){
				fact = fact*i;
			}
			System.out.println("Factorial of "+n+" is "+fact);
		}
	}

}