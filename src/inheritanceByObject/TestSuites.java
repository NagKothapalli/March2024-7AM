package inheritanceByObject;

import org.junit.Test;

//             child              parent
public class TestSuites //extends TestCases  //simple inheritance
{
	//Modifier   ClassName  objectName   =  new Constructor();
	
	public TestCases tc = new TestCases("chrome"); // default constructor
	
	//public TestCases tc = new TestCases("edge");
	//public TestCases tc = new TestCases("chrome",120);
	
	@Test
	public void smokeSuite() // Build validation Testing - BVT 
	{
		System.out.println("Test Suite : SMOKE");
		tc.sendMail("nag@gmail.com");
		tc.composeAndSendAnEmail();
		tc.replyToAnEmail();
	}
	
	@Test
	public void regressionSuite()
	{
		System.out.println("Test Suite : REGRESSION");
		tc.composeAndSendAnEmail();
		tc.replyToAnEmail();
		tc.forwardToAnEmail();
		tc.deleteAnEmail();
	}
	


}
