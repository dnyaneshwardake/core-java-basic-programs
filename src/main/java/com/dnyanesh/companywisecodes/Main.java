package com.dnyanesh.companywisecodes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/* Do not add a package declaration */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
	public static Map<String, Integer> processData(ArrayList<String> array)
	{

		Map<String, Integer> retVal = new HashMap<String, Integer>();

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < array.size(); i++)
		{
			String input = array.get(i);
			System.out.println(input); // Print All Data On Console
			boolean flag1 = false, flag2 = false;
			String id = "", subject = "", marks = "";
			for (int j = 0; j < input.length(); ++j) // Traversing and Parsing
														// The Input
			{
				if (flag2)
				{
					marks = marks + input.charAt(j);
					continue;
				}
				if (!flag1)
				{
					if (input.charAt(j) == '|') // Traverse Data and split at
												// location '|'
						flag1 = true;
					else id = id + input.charAt(j);

				} else if (flag1)
				{
					if (input.charAt(j) == '|')
						flag2 = true;
					else subject = subject + input.charAt(j);
				}

			}
			int Id = Integer.parseInt(id); // Parse String To Integer as We
											// Declared it as Integer
			int Marks = Integer.parseInt(marks); // Parse String To Integer as
													// We Declared it as Integer
			if (map.get(subject) == null)
			{
				map.put(subject, new Integer(Id));
				retVal.put(subject, new Integer(Marks));
			} else
			{
				int m = map.get(subject);
				if (Marks < m)
				{ // Check Condition For Minimum Marks of Students
					map.put(subject, new Integer(Id)); // Show Dependency
														// Between
														// Id-Subject-Marks
					retVal.put(subject, new Integer(Marks));
				}
			}

		}

		return retVal; // Return Final Map
	}

	public static void main(String[] args)
	{
		ArrayList<String> inputData = new ArrayList<String>();
		String line;
		try
		{
			Scanner in = new Scanner(new BufferedReader(new FileReader("D:\\input.txt")));
			while (in.hasNextLine())
				inputData.add(in.nextLine());
			Map<String, Integer> retVal = processData(inputData);
			PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("D:\\output.txt")));
			for (Map.Entry<String, Integer> e : retVal.entrySet())
				output.println(e.getKey() + ": " + e.getValue());
			output.close();
		} catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}