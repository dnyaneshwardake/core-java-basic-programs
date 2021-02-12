package com.dnyanesh.exceptionhandling;

public class InvalidAgeException extends Exception
{
	public InvalidAgeException()
	{
		super("Age is not valid for merrage");
	}
	private static final long serialVersionUID = -7349620527525316461L;

	public static void main(String[] args)
	{
		try
		{
			throw new InvalidAgeException1();
		} catch(InvalidAgeException1 e)
		{
			// throw new InvalidAgeException1();
			System.out.println(e);
		}
	}

}
