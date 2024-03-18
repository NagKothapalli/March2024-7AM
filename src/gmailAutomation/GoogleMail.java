package gmailAutomation;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class GoogleMail
{
	
	String expectedTitle = "Gmail";
	ChromeDriver driver  = new ChromeDriver(); //opens an empty google chrome browser
	
	public GoogleMail()
	{		
		System.out.println("Constructor of the GoogleMail class Executed");
	}
	
	@Before           //@Test
	public void launchGmailApplication()
	{
		System.out.println("Test : Launch Gmail Application");		
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
	
	//Execution Flow : Class variables -> Constructor  -> Before method -> Test Method
	//org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element
	
	//By class Methods : ID , Name , Class Name , Tag Name , LinkText , Partial LinkText , Xpath
	
	@Test
	public void loginToGmailApplication()
	{
		System.out.println("Test Case : Login to Gmail Application");
		//driver.findElement(By.name("identifier")).sendKeys("nag022@gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("nag022@gmail.com");
		driver.findElements(By.className("VfPpkd-vQzf8d")).get(1).click();
	}
	
	@Test
	public void forgotEmail()
	{
		System.out.println("Test Case : Forgot Email");
		//driver.findElement(By.tagName("button")).click();
		driver.findElements(By.tagName("button")).get(0).click();
	}
	
	@Test
	public void learnMore()
	{
		System.out.println("Test Case : Learn more about using Guest mode");
		//driver.findElement(By.linkText("Learn more about using Guest mode")).click();
		//driver.findElement(By.tagName("a")).click();
		driver.findElements(By.tagName("a")).get(0).click();
	}
	
	@Test
	public void createAccount() throws InterruptedException
	{
		System.out.println("Test Case : Create Account");
		Thread.sleep(2000);
		driver.findElements(By.className("VfPpkd-vQzf8d")).get(2).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
