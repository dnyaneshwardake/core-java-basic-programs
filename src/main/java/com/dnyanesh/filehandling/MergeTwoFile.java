package com.dnyanesh.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class MergeTwoFile {
	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter("f3.txt");
		BufferedReader br = new BufferedReader(new FileReader("f1.txt"));
		String line = br.readLine();
		while(line!=null){
			pw.println(line);
			line = br.readLine();
		}
		br = new BufferedReader(new FileReader("f2.txt"));
		String l = br.readLine();
		while(l!=null){
			pw.println(l);
			l = br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
	}

}
