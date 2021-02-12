package com.dnyanesh.list;

import java.util.Arrays;

public class TestCode
{

	private int getNo(int[] inputArray)
	{
		int count = 0;
		int[] tempArr = null;
		int t = 0;
		if (inputArray.length > 100)
		{
			return -1;
		}

		for (int i = 0; i < inputArray.length; i++)
		{
			for (int j = 1; j < inputArray[i]; j++)
			{
				int temp = inputArray[i] / j;
				if (temp == 0)
				{
					count++;
				}

			}
			if (count == 2)
			{
				tempArr[t] = inputArray[i];
			}
		}

		Arrays.sort(tempArr);
		return tempArr[tempArr.length - 1];
	}

	public static void main(String[] args)
	{

	}
}
