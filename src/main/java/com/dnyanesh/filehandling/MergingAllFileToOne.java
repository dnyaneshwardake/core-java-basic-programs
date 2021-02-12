package com.dnyanesh.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class MergingAllFileToOne {
	public static void main(String[] args) throws Throwable {
		PrintWriter pw = new PrintWriter("output.txt");
		File f = new File("E:\\dakebhau");
		String[] list = f.list();
		for (String l1 : list) {
			BufferedReader br = new BufferedReader(new FileReader(new File(f,l1)));
			String line = br.readLine();
			while(line!=null) {
				pw.println(line);
				line = br.readLine();
			}
		}
		pw.flush();
		pw.close();
	}

}

