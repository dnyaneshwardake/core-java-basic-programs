package com.dnyanesh.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class UsingThrow4Methods {
	UsingThrow4Methods() throws FileNotFoundException{
		PrintWriter pw = new PrintWriter("abc.txt");
	}
	
	public static void doStuff() throws InterruptedException {
		doMoreStuff();
	}
	private static void doMoreStuff() throws InterruptedException {
		Thread.sleep(1000);
	}

	public static void main(String[] args) throws InterruptedException {
		doStuff();
		
	}

}
