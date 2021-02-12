package com.dnyanesh.fang.codes;

public class StringIntAdd {
	public static void main(String[] args) {
	final String s = "thi2s is3 4java";
	int sum = 0;
	for(int i=0; i<s.length(); i++) {
		try{
			sum = sum + Integer.parseInt((""+s.charAt(i)));
		}
		catch(Exception e){
			//System.out.println(e.getMessage());
		}
	}
	System.out.println(sum);
	}
}
