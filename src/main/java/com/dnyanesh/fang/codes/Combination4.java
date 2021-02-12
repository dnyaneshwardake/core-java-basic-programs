package com.dnyanesh.fang.codes;

public class Combination4
{
    public static void main(String[] args)        
    {
        int [] input={1,4,3,5};
        for(int x=0;x<4;x++)
        {
            for(int y=0;y<4;y++)
            {
                for(int z=0;z<4;z++)
                {
                    for(int w=0;w<4;w++)
                        {
                            if(x!=y && x!=z && x!=w && y!=z && y!=w && z!=w)
                            {
                                System.out.println(input[x]+""+input[y]+""+input[z]+""+input[w]);
                            }
                        }
                }
            }
        }
    }
}