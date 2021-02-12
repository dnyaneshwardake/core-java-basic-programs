package com.dnyanesh.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("file1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch = {'a','b','c'};
		bw.write(ch);
		bw.newLine();
		bw.write("Dnyanesh");
		bw.newLine();
		bw.flush();
		bw.close();
	}

}
