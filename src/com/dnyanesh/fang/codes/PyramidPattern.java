package com.dnyanesh.fang.codes;

public class PyramidPattern {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
            for(int j=1;j<5-(i-1);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
                for(int k1=1;k1<k;k1=k1+k){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
	}
}