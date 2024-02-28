package coreConcepts;

import org.junit.Test;

public class StringOperations
{
	String a = "     Selenium With Java              ";
	
	String b = "Selenium With Java";
	
	@Test
	public void basicOperations()
	{
		int count = a.length();
		System.out.println("Length of the string :"+ count);
		String aT = a.trim();
		System.out.println("String after trim :" + aT);
		int len = aT.length();
		System.out.println("Length after trim:" + len);
		String aL = a.trim().toLowerCase();
		System.out.println("String after lowercase :" + aL);
		String aU = a.trim().toUpperCase();
		System.out.println("String after uppercase :" + aU);
	}
	@Test
	public void subString()
	{
		String a8 = a.trim().substring(8);
		System.out.println(a8);
		String a08 = a.trim().substring(0, 8);
		System.out.println(a08);
	}
	
	//concatenation , split , equals , contains
	@Test
	public void concatenation()
	{
		String c = a.concat(b); // c = a+b;
		System.out.println(c);
		
		System.out.println(a+b);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
