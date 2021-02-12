package com.dnyanesh.fang.codes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubstringSearchMatcher {
	public static void main(String[] args){
		//To matches of particular substring
		String text = "dakednyandak#e#seedake";
		String pattern = "dak#e";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		int matcher=0;
		while(m.find()){
			matcher++;
		}
		if(matcher<1){
			System.out.println("Pattern not found");
		}
		else{
			System.out.println("Pattern Found " +matcher+" Times");
		}
	}
}
