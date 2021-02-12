package com.dnyanesh.companywisecodes;

public class SentenceWordsReverse{
    public static void main(String args[]){
    	String s = "He is the one";
    String str[] = s.split(" ");
    String finalStr="";
        for(int i = str.length-1; i>= 0 ;i--){
            finalStr += str[i]+" ";
        }
        System.out.println(finalStr);
    }
}