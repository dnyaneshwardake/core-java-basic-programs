package com.dnyanesh.fang.codes;

import java.util.*;
public class ArraySecondLargestNo 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int size = sc.nextInt();
        int largest=0,secondl=0;
        System.out.println("Enter the "+size+" Element");
        int array[] = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            if(array[i]>largest)
            {
                secondl=largest;
                largest=array[i];
            }
            else if(array[i]>secondl)
            {
                secondl=array[i];
            }      
        }
        System.out.println("Second Largest no Is "+secondl);
    }
}