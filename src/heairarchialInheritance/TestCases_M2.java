package heairarchialInheritance;

import org.junit.Test;

//TestSuites          TestCases       ReusableComponents
// child                parent          grand parent


//             child              parent
public class TestCases_M2 extends ReusableComponents
{
  //this , super - keyword
	
	@Test
	public void forwardToAnEmail() //Rajesh
	{
		//launch application , login to application 
		System.out.println("Test Case : Forward An Email");
		launchApplication();
		loginToApplication();
		open();
		forward();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void deleteAnEmail() //Ramesh
	{
		//launch application , login to application 
		System.out.println("Test Case : Delete An Email");
		launchApplication();
		loginToApplication();
		open();
		delete();
		logoutFromApplication();
		closeApplication();
	}
}
