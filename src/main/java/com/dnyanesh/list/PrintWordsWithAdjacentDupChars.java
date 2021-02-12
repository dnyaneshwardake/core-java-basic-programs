package com.dnyanesh.list;

import java.util.ArrayList;

public class PrintWordsWithAdjacentDupChars {
	
	public static void main(String[] args) {
		String[] s = {"app","By","Hello","Cat","Summer","way"};
		
		ArrayList al = new ArrayList();
		
		for (String word : s) {
			for (int i = 0; i < word.length()-1; i++) {
				if(word.charAt(i)==word.charAt(i+1)){
					al.add(word);
					break;
				}
			}
		}
		System.out.println(al);
	}
}
