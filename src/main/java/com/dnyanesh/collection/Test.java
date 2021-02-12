package com.dnyanesh.collection;

/*public class Test {
	public int sum(int a, int b) {
		System.out.println("Method 1 Excuted");
		return(0);
	}
	public double sum(double c, int d) {
		System.out.println("Method 2 Excuted");
		return(0);
	}
	public static void main(String[] args) {
		Test t = new Test();
		//t.sum((byte)10, (byte) 10);
		t.sum(20, 30);
	}
}
*/
import java.util.Locale;

public class Test
{
	public static void main(String[] args)
	{
		Locale locale = Locale.getDefault();
		// Locale locale=new Locale("fr","fr");//for the specific locale

		System.out.println(locale.getDisplayCountry());
		System.out.println(locale.getDisplayLanguage());
		System.out.println(locale.getDisplayName());
		System.out.println(locale.getISO3Country());
		System.out.println(locale.getISO3Language());
		System.out.println(locale.getLanguage());
		System.out.println(locale.getCountry());

	}
}