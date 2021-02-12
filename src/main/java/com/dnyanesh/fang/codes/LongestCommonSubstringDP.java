package com.dnyanesh.fang.codes;

public class LongestCommonSubstringDP {
    /**
     * Dynamic way of calculating lcs
     */
    public int longestCommonSubstring(char str1[], char str2[]){
    	StringBuilder s = new StringBuilder();
    	int T[][] = new int[str1.length+1][str2.length+1];
        int max = 0;
        for(int i=1; i <= str1.length; i++)
        {
            for(int j=1; j <= str2.length; j++)
            {
                if(str1[i-1] == str2[j-1])
                {
                    T[i][j] = T[i-1][j-1] +1;
                    if(max < T[i][j])
                    {
                        max = T[i][j];
        				s = s.append(str1[max]); //print the matched string
                    }
                }
            }
        }
        System.out.println("String is " +s);
        return max;
    }
    
    public static void main(String args[]){
        LongestCommonSubstringDP lcs = new LongestCommonSubstringDP();
        char str1[] = "abvdsbvf".toCharArray();
        char str2[] = "gbvdsbnfn".toCharArray();
        System.out.println(lcs.longestCommonSubstring(str1, str2));
    }
}