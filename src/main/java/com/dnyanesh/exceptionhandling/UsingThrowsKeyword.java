package com.dnyanesh.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class UsingThrowsKeyword
{
	public static void main(String[] args) throws FileNotFoundException
	{
		PrintWriter pw = new PrintWriter("abc.txt");
		// throw new Exception();
	}
}
