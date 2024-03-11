package testBatches;

import org.junit.Test;

import testScenarios.TestCases;

//             child              parent
public class TestSuites extends TestCases  //simple inheritance
{
	/*
	 * public void launchApplication() {
	 * System.out.println("RC : Launch Application  from TestSuites"); }
	 */
	@Test
	public void smokeSuite() // Build validation Testing - BVT 
	{
		System.out.println("Test Suite : SMOKE");
		composeAndSendAnEmail();
		replyToAnEmail();
		//this.launchApplication();
		//super.launchApplication();
		//launchApplication();
	}
	
	@Test
	public void regressionSuite()
	{
		System.out.println("Test Suite : REGRESSION");
		composeAndSendAnEmail();
		replyToAnEmail();
		forwardToAnEmail();
		deleteAnEmail() ;
	}
	


}
