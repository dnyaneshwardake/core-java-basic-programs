package com.dnyanesh.fang.codes;

public class SubStringSearchRegular{
	public static void main(String args[]){
        String str = "sdfvkshbfkshnfk";
        String subString = "shbfk";
        char[] text = str.toCharArray();
        char[] pattern = subString.toCharArray();
        SubStringSearchRegular ss = new SubStringSearchRegular();
        ss.stringMatch(text, pattern);
    } 
/**
 * Slow method of pattern matching
 */
public void stringMatch(char[] text, char[] pattern){
    int i=0;
    int j=0;
    int k = 0;
    while(i < text.length && j < pattern.length){
        if(text[i] == pattern[j]){
            i++;
            j++;
        }else{
            j=0;
            k++;
            i = k;
        }
    }
    if(j == pattern.length){
        System.out.println("Found");
    }
    else
    System.out.println("Not Found");
	}
}