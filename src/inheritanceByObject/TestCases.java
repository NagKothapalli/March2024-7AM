package inheritanceByObject;

import org.junit.Test;

//TestSuites          TestCases       ReusableComponents
// child                parent          grand parent


//             child              parent
public class TestCases
{
	
	public TestCases()
	{
		System.out.println("Open Google chrome Browser");
		System.out.println("Delete Temp records");
	}
  //this , super - keyword
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
		
	}
	@Test
	public void forwardToAnEmail() //Rajesh
	{
		//launch application , login to application 
		System.out.println("Test Case : Forward An Email");
		
	}
	@Test
	public void deleteAnEmail() //Ramesh
	{
		//launch application , login to application 
		System.out.println("Test Case : Delete An Email");
		
	}
}
