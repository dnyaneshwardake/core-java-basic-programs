package com.dnyanesh.fang.codes;

import java.util.regex.*;

/**
 * @author DNYANESH
 *
 */
public class StringMore{
	public static void main(String[] args){
		String s1 = "Dake";
		String s2 = "Dake";
		//To check string is from same string pool
		String s3 = new String ("Dake").intern();
		System.out.println("Is the same pool:- "+(s1 == s2));
		System.out.println("Is the same pool:- "+(s1 == s3));
		//To find the regular expression
		String s4 = "Dake is Dnyaneshwar";
		System.out.println(s4.matches("(.*) Dnyaneshwar"));
		//To matches of particular substring
		String s5 = "dakednyandakeseedake";
		Pattern p = Pattern.compile("dake");
		Matcher m = p.matcher(s5);
		//count the occurrences
		int matcher=0;
		while(m.find()){
			matcher++;
		}
		System.out.println(matcher);
		
		String s6 = "dakeadkae gjjg";
		System.out.println(s6.length());
		System.out.println(s6.substring(s6.length()));
		System.out.println(s6.substring(2,5));
		System.out.println(s6.indexOf('a'));
		System.out.println(s6.substring(5));
		
		String s7 = 10 + 20 + "10" + 5 + 10;
		System.out.println(s7);
		
		
		
	}
}