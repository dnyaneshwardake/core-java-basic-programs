package com.dnyanesh.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileReader1 {
	public static void main(String[] args) throws IOException {
		try {
			FileReader fr = new FileReader("dakebio.txt");
			int i = fr.read();
			while(i!=-1){
				System.out.print((char)i);
				i = fr.read();
			}
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Avalable in Mentioned Directory");
			e.printStackTrace();
		}
	}
}
