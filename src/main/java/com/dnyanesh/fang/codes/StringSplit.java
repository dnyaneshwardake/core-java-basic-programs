package com.dnyanesh.fang.codes;

public class StringSplit {
	 
    public static void main(String a[]){
     
        String str = "This program splits a string based on space";
        String[] tokens = str.split(" ");
        for(String s:tokens){
            System.out.println(s);
        }
        //str = "This program splits a string based on space";
        //tokens = str.split("\\s+");
    }
}