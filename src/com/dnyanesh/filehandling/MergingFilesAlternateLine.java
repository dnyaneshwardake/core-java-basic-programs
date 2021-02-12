package com.dnyanesh.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class MergingFilesAlternateLine {
	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter("f3.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("f1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("f2.txt"));
		String line1 = br1.readLine();
		String line2 = br2.readLine();
		while((line1!=null) || (line2!=null)){
			if(line1!=null){
				pw.println(line1);
				line1 = br1.readLine();
			}
			if(line2!=null) {
				pw.println(line2);
				line2 = br2.readLine();
			}
		}
		pw.flush();
		pw.close();
	}
}
