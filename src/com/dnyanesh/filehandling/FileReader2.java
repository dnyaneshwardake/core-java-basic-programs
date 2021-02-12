package com.dnyanesh.filehandling;

import java.io.*;

public class FileReader2 {
	public static void main(String[] args) throws Throwable {
		File f = new File("dakebio.txt");
		FileReader fr = new FileReader(f);
		char[] ch = new char[(int)f.length()];
		fr.read(ch);
		for (char ch1 : ch) {
			System.out.print(ch1);
		}
	}

}
