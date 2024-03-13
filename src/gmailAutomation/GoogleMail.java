package gmailAutomation;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class GoogleMail
{
	
	String expectedTitle = "Amail";
	
	@Test
	public void launchGmailApplication()
	{
		System.out.println("Test : Launch Gmail Application");
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://gmail.com");
		String sessionID = driver.getWindowHandle();
		System.out.println("Session ID of the window :" + sessionID);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL :" + currentUrl);
		String actualTtitle = driver.getTitle();
		System.out.println("Title : " + actualTtitle);
		//Assert.assertEquals(expectedTitle,actualTtitle);
		if(expectedTitle.equals(actualTtitle))
		{
			System.out.println("Launch Application Passed");
		}
		else
		{
			System.out.println("Launch Application Failed");
		}
		
		
	}

}
