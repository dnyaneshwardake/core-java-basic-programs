package com.dnyanesh.companywisecodes;


public class PTCQuestion {
	
	public void computeLPSArray(char str[], int M, int lps[])
	{
	    int len = 0; //lenght of the previous longest prefix suffix
	    int i;
	 
	    lps[0] = 0; //lps[0] is always 0
	    i = 1;
	 
	    // the loop calculates lps[i] for i = 1 to M-1
	    while (i < M)
	    {
	       if (str[i] == str[len])
	       {
	           len++;
	           lps[i] = len;
	           i++;
	       }
	       else // (pat[i] != pat[len])
	       {
	          if (len != 0)
	          {
	             // This is tricky. Consider the example AAACAAAA
	             // and i = 7.
	             len = lps[len-1];
	 
	             // Also, note that we do not increment i here
	          }
	          else // if (len == 0)
	          {
	             lps[i] = 0;
	             i++;
	          }
	       }
	    }
	}
	 
	// Returns true if str is repetition of one of its substrings
	// else return false.
	 boolean doesStringHasPattern(char str[])
	{
	    int n = str.length;
	    int[] lps=new int[n];
	    computeLPSArray(str, n, lps);
	    int len = lps[n-1];
	    return (len > 0 && n%(n-len) == 0)? true: false;
	}
	public static void main(String[] args) {
		PTCQuestion q = new PTCQuestion();
		String s = "ababab";
		char[] str = s.toCharArray();
		System.out.println(q.doesStringHasPattern(str));
	}	
}