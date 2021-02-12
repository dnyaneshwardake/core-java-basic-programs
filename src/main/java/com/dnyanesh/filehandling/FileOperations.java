package com.dnyanesh.filehandling;

import java.io.File;
import java.io.IOException;

public class FileOperations {
	public static void main(String[] args) {
		File f = new File("E:\\dakebhau");
		f.mkdir();
		File f1 = new File(f, "dakebhau.txt");
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception :");
		}
		long length = f1.length();
		System.out.println(length);
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f1.isDirectory());
		String[] s = f1.list();
		System.out.println(f1.isFile());
	}

}
