package com.dnyanesh.fang.codes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringPermutations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String...");
		String s = sc.nextLine();
		System.out.println("\nString " + s + ":\nPermutations: " + StringPermutations(s));
	}
	public static Set<String> StringPermutations(String str) {
		Set<String> result = new HashSet<String>();
		if (str == null) {
			return null;
		} else if (str.length() == 0) {
			result.add("");
			return result;
		}
		char firstChar = str.charAt(0);
		String rem = str.substring(1);
		Set<String> words = StringPermutations(rem);
		for (String newString : words) {
			for (int i = 0; i <= newString.length(); i++) {
				result.add(charAdd(newString, firstChar, i));
			}
		}
		return result;
	}
	public static String charAdd(String str, char c, int j) {
		String first = str.substring(0, j);
		String last = str.substring(j);
		return first + c + last;
	}
}