package heairarchialInheritance;

import org.junit.Test;

//TestSuites          TestCases       ReusableComponents
// child                parent          grand parent


//             child              parent
public class TestCases_M1 extends ReusableComponents
{
  //this , super - keyword
	@Test //Annotation ,  @Before  , @After
	public void composeAndSendAnEmail()  // Ravi
	{
		//launch application , login to application , compose , send , logout , close 
		System.out.println("Test Case : Compose And Send An Email");
		launchApplication();
		loginToApplication();
		compose();
		send();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void replyToAnEmail() //Raj
	{
		//launch application , login to application 
		System.out.println("Test Case : Reply to An Email");
		launchApplication();
		loginToApplication();
		open();
		reply();
		logoutFromApplication();
		closeApplication(); 
	}
	
}
