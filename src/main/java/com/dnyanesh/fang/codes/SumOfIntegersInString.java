package com.dnyanesh.fang.codes;

public class SumOfIntegersInString
{
    public static void main(String[] args)
    {               
        String s = "2some text3 more4 text";
        s = s.replaceAll("[\\D]+"," ");
        String[] numbers = s.split(" ");
        int sum=0;
        for(int i=0;i<numbers.length;i++)
        {
            sum += Integer.parseInt(numbers[i]);
        }
        System.out.println("Addition Is "+sum);
    }
}