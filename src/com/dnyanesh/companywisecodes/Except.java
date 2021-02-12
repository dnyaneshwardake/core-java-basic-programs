package com.dnyanesh.companywisecodes;
class BadArgsException extends MyException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8660421912888628586L;

}

public class Except
{
	public static boolean checkArgs(String[] args) throws MyException
	{
		if (args.length != 2)
		{
			throw new BadArgsException();
		}
		return true;
	}

	public static void main(String[] args)
	{
		try
		{
			Except.checkArgs(args);
		} catch(BadArgsException b)
		{
			System.out.println("Bad arguments");
			System.exit(-1);
		} catch(MyException e)
		{
			System.out.println("Unknown exception");
			System.exit(-2);
		}
		System.out.println("Success");
	}
}