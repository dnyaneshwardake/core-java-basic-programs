package com.dnyanesh.filehandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

// See difference of Println() & write() method

public class PrintWriterDemo {

	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter("file2.txt");
		pw.write(100);
		pw.println(100);
		pw.println("Dnyanesh");
		char[] ch = {'a','b','c'};
		pw.write(ch);
		pw.println(100);
		pw.flush();
		pw.close();

	}

}
