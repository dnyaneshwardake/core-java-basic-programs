package com.dnyanesh.filehandling;

import java.io.File;

public class CountNumberofFiles {
	public static void main(String[] args) {
		File f = new File("C:\\Windows");
		int count=0;
		int count1=0;
		String[] list = f.list();
		for (String string : list) {
			File f1 = new File(f, string);
			if(f1.isDirectory()){
				count++;
				System.out.println(string);
			}
			if(f1.isFile()){
				count1++;
				System.out.println(string);
			}
		}
		System.out.println("Folder : " +count);
		System.out.println("Files :" +count1);
		System.out.println("total = " +(count+count1));
		StringBuffer s1 = new StringBuffer("shri");
		StringBuffer s2 = new StringBuffer("shri");
		System.out.println(s1.equals(s2));
	}
}