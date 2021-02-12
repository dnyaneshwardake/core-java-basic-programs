package com.dnyanesh.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FIleWriterDemo {
	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("dakebio.txt", true);
			
			/*true used to append data, otherwise it will overwrite
				existing data*/
			
			fw.write(100);
			fw.write("ake Dnyanesh\n");
			fw.write("\n");
			fw.write("Dharmaraj");
			char[] ch = {'a','b','c'};
			fw.write(ch);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Inserted Successfully");
		}
	}

}
