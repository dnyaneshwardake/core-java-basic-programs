package com.dnyanesh.fang.codes;

public class Combination2
{
    public static void main(String[] args)        
    {
        int [] input={1,4};
        for(int x=0;x<2;x++)
        {
            for(int y=0;y<2;y++)
            {
                if(x!=y)
                {
                    System.out.println(input[x]+""+input[y]);
                }
                
            }
        }
    }
}