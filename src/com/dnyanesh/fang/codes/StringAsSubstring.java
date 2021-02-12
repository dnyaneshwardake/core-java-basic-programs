package com.dnyanesh.fang.codes;

import java.util.*;
import java.lang.String;
 
public class StringAsSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Teaxt");
        String string1 = input.next();
        System.out.print("Enter Pattern");
        String string2 = input.next();
        if (isSubstring(string1, string2)) {
            System.out.println("Pattern Found");
        } else {
            System.out.println("Pattern Not Found");
        }
    }   
    public static boolean isSubstring(String string1, String string2) {
        char c;
        char d;
        boolean match = true;
        for (int i = 0; i < string1.length(); i++) {
            c = string1.charAt(i);
            for (int j = 0; i < string2.length(); i++) {
                d = string2.charAt(i);
                if (c == d) {
                    match = true;
                } else {
                    match = false;
                }   
            }
        }
        return match;
    }
}