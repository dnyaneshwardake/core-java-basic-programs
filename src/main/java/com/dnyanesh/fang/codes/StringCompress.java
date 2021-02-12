package com.dnyanesh.fang.codes;

public class StringCompress {
	public static void main(String[] args) {
		
		String s = "aaaddddffccccd";
		String answer = "";
		int count = 1;
		int sum = 0;
		char str[] = s.toCharArray();
		//char[] out = new char[20];
		char y = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(sum==s.length())
				break;
			count = 1;
			y=0;
			for( int j=i+1; j<s.length();j++) { 
				if(str[i]==str[j]) {
					count++;
					y = str[i];
				}else {i=j-1;
					break;
				}
			}
			answer = answer+y+count;
			sum = sum + count;
			
		}
		System.out.println(answer);
	}
}