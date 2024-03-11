package coreConcepts;

import org.junit.Test;

public class GmailWithJunit
{
	
	//Junit : Unit Test Framework , used for executing unit test cases . JUnit is a unit testing framework to write and run repeatable automated tests on Java.
	
	//TDD : Test Driven Development  , Code Coverage must be 100 % 
	
	// SDET : Software Development Engineer in Testing 
	
	@Test
	public void smokeSuite() // Build validation Testing - BVT 
	{
		System.out.println("Test Suite : SMOKE");
		composeAndSendAnEmail();
		replyToAnEmail();
		
	}
	
	@Test
	public void regressionSuite()
	{
		System.out.println("Test Suite : SMOKE");
		composeAndSendAnEmail();
		replyToAnEmail();
		forwardToAnEmail();
		deleteAnEmail() ;
	}
	
	
	
	//@Test //Annotation ,  @Before  , @After
	private void composeAndSendAnEmail()  // Ravi
	{
		//launch application , login to application , compose , send , logout , close 
		System.out.println("Test Case : Compose And Send An Email");
	}
	//@Test
	void replyToAnEmail() //Raj
	{
		//launch application , login to application 
		System.out.println("Test Case : Reply to An Email");
		//logout , close 
	}
	//@Test
	protected void forwardToAnEmail() //Rajesh
	{
		//launch application , login to application 
		System.out.println("Test Case : Forward An Email");
		//logout , close 
	}
	//@Test
	public void deleteAnEmail() //Ramesh
	{
		//launch application , login to application 
		System.out.println("Test Case : Delete An Email");
		//logout , close 
	}

}
