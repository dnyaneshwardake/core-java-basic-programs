package com.dnyanesh.companywisecodes;

import java.util.Scanner;

public class StringAsSubString {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String... : ");
		String str = sc.nextLine();
		System.out.println("Enter string to be search... : ");
		String pattern = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < pattern.length(); j++) {
				if (str.charAt(i) == pattern.charAt(j)) {
					count++;
					continue;
				}
				if (count == pattern.length()) {
					System.out.println("Present");
				}
			}
		}

	}
}
