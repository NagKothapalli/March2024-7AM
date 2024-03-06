package inheritanceByExtends;

import org.junit.Test;

public class TestCases
{

	@Test //Annotation ,  @Before  , @After
	public void composeAndSendAnEmail()  // Ravi
	{
		//launch application , login to application , compose , send , logout , close 
		System.out.println("Test Case : Compose And Send An Email");
	}
	@Test
	public void replyToAnEmail() //Raj
	{
		//launch application , login to application 
		System.out.println("Test Case : Reply to An Email");
		//logout , close 
	}
	@Test
	public void forwardToAnEmail() //Rajesh
	{
		//launch application , login to application 
		System.out.println("Test Case : Forward An Email");
		//logout , close 
	}
	@Test
	public void deleteAnEmail() //Ramesh
	{
		//launch application , login to application 
		System.out.println("Test Case : Delete An Email");
		//logout , close 
	}
}
