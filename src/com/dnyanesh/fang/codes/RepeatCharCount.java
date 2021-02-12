package com.dnyanesh.fang.codes;

import java.io.*;
public class RepeatCharCount
{
    static int i,j,k,c=0,w;
    static char m;
    public static void main(String[] args)
    {
        System.out.println("Input String Is :");
        System.out.println("Dnyaneshwar Dake");
        System.out.println("");
        System.out.println("Output");
        frequencycount("Dnyaneshwar Dake");
    }
    @SuppressWarnings("empty-statement")
    static void frequencycount(String s)
    {
        char[] z = new char[s.length()];
        for(w=0;w<s.length();w++)
        z[w] = s.charAt(w);
        for(i=0;i<w;i++)
        {
            char ch=z[i];
            for(j=i+1;j<w;j++)
            {
                if(z[j]==ch)
                {
                    for(k=j;k<(w-1);k++)
                    z[k]=z[k+1];
                    w--;
                    j=i;
                }
            }
        }
        int[] t = new int[w];
        for(i=0;i<w;i++)
        {
            for(j=0,c=0;j<s.length();j++)
            {
                if(z[i]==s.charAt(j))
                    c++;
            }
            t[i]=c;
            System.out.println(z[i]+"="+c+",");
        }
    }
}