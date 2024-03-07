package inheritanceByExtends;

import org.junit.Test;

//             child              parent
public class TestSuites extends TestCases  //simple inheritance
{
	@Test
	public void smokeSuite() // Build validation Testing - BVT 
	{
		System.out.println("Test Suite : SMOKE");
		//composeAndSendAnEmail();
		//replyToAnEmail();
		launchApplication();
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
