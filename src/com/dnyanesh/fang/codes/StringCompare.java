package com.dnyanesh.fang.codes;

import java.util.*;
public class StringCompare 
{
    public static void main(String[] args)
    {
        String s1,s2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First String");
        s1=in.nextLine();
        System.out.println("Enter Second String");
        s2=in.nextLine();
        if(s1.compareTo(s2)>0)
        {
            System.out.println("String Are Not Equal");
        }
        else if(s1.compareTo(s2)<0) 
        {
            System.out.println("String Are Not Equal");
        }
        else
        {
            System.out.println("Equal");
        }
    }
}
