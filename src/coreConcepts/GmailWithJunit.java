package coreConcepts;

import org.junit.Test;

public class GmailWithJunit
{
	
	//Junit : Unit Test Framework , used for executing unit test cases . JUnit is a unit testing framework to write and run repeatable automated tests on Java.
	
	//TDD : Test Driven Development  , Code Coverage must be 100 % 
	
	// SDET : Software Development Engineer in Testing 
	
	@Test //Annotation ,  @Before  , @After
	public void composeAndSendAnEmail()  // Ravi
	{
		//launch application , login to application , compose , send , logout , close 
		System.out.println("Test Case : Compose And Send An Email");
	}
	@Test
	public void replyToAnEmail() //Raj
	{
		System.out.println("Test Case : Reply to An Email");
	}
	@Test
	public void forwardToAnEmail() //Rajesh
	{
		System.out.println("Test Case : Forward An Email");
	}
	@Test
	public void deleteAnEmail() //Ramesh
	{
		System.out.println("Test Case : Delete An Email");
	}

}
