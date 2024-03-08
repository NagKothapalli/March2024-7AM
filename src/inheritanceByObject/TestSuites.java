package inheritanceByObject;

import org.junit.Test;

//             child              parent
public class TestSuites //extends TestCases  //simple inheritance
{
	//Modifier   ClassName  objectName   =  new Constructor();
	
	public TestCases tc = new TestCases(); // default constructor
	
	@Test
	public void smokeSuite() // Build validation Testing - BVT 
	{
		System.out.println("Test Suite : SMOKE");
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
