package com.dnyanesh.filehandling;

public class TestIO {
	public static void main(String[] args) {
		String s = "abcdefghijklmnopqrstuvwxyz";
		//char[] ch = s.toCharArray();
		String s1 = s.toUpperCase();
		//char[] ch1 = s1.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			System.out.print((int)s.charAt(i)+",");
		}
		System.out.println();
		for (int i = 0; i < s1.length(); i++) {
			System.out.print((int)s1.charAt(i)+",");
		}
		
	}

}
