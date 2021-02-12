package com.dnyanesh.fang.codes;

import java.util.*;
public class StringRotational 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String");
        String s1 = sc.nextLine();
        System.out.println("Second String");
        String s2 = sc.nextLine();
        char[] chars1 = s1.toCharArray();
        Arrays.sort(chars1);
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars2);
        String sorted1 = new String(chars1);
        String sorted2 = new String(chars2);
        if(sorted1.compareTo(sorted2)>0)
        {
            System.out.println("Not Equal");
        }
        else if(sorted1.compareTo(sorted2)<0)
        {
            System.out.println("Not Equal");
        }
        else
        {
            System.out.println("Equal");
        }
    }
}
