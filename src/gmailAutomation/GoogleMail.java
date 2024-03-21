package gmailAutomation;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
	
	//WebDriver [ I ]  :  ChromeDriver [C] , FirefoxDriver [C] , EdgeDriver [C] , OperaDriver [C]
	
	//The functionality that we can do at browser level are included in the WebDriver : get(),getCurrentUrl(), getTitle(),getWindowHandle(),getWindowHandles(), findElement(),
											//findElements() , close() , quit(), refresh(), minimize() , maximize()
	
	// WebElements level functions are included in the WebElement : click() , clear() , sendKeys() , getText(), getAttribute() , isDisplayed() , isEnabled() ,findElement(),
	                                                                //findElements()
	
	//All selenium selectors / Locators are included in  By class : ID , Name , Class Name , Tag Name , LinkText , Partial LinkText , Xpath
	
	// All types of webelements : button , textbox , radio button , checkbox , iframe , drop downs , mouse hover , double click , right click
	
	//xpath : XML path / Absolute xpath / static xpath , fixed xapth
	
	//Relative xpath : //tagName[@attribute = value ]  -> angular , react , php 
	
	//tagName[contains(@attribute , value) ]
	
	//*[@attribute = value ]
	
	//*[contains(@attribute , value) ]
	
	//tagName[text() = value ] 
	
	//tagName[contains(text() , value) ] 
	
	//*[text() = value ] 
	
	//*[contains(text() , value) ] 
	
	//tagName[@attribute = value and text() = value]
	
	//tagName[@attribute1 = value and @attribute2 = value]	
	
	//tagName[@attribute1 = value or @attribute2 = value]
	
	
	
	@Test
	public void loginToGmailApplication()
	{
		System.out.println("Test Case : Login to Gmail Application");
		//driver.findElement(By.name("identifier")).sendKeys("nag022@gmail.com");
		driver.findElements(By.className("VfPpkd-vQzf8d")).get(0).click();
		driver.findElement(By.id("identifierId")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("identifierId")).clear();
		//driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("nag022@gmail.com");
		//driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("nag022@gmail.com");
		driver.findElement(By.xpath("//input[@id='identifierId' or @id='identifierId2']")).sendKeys("nag022@gmail.com");
		//select salary from emp where ename=ravi
		//driver.findElements(By.className("VfPpkd-vQzf8d")).get(1).click();
		driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d' and text()='Next']")).click();
	}
	
	@Test
	public void forgotEmail()
	{
		System.out.println("Test Case : Forgot Email");
		//driver.findElement(By.tagName("button")).click();
		//driver.findElements(By.tagName("button")).get(0).click();
		driver.findElements(By.className("VfPpkd-vQzf8d")).get(0).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div[1]/form/span/section/div/div/div[3]/button")).click();
								  ///html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div[1]/form/span/section/div/div/div[3]/button
		driver.findElement(By.xpath("//button[text()='Forgot email?']")).click();
	}
	
	@Test
	public void learnMore()
	{
		System.out.println("Test Case : Learn more about using Guest mode");
		//driver.findElement(By.linkText("Learn more about using Guest mode")).click();
		//driver.findElement(By.partialLinkText("Learn more about using")).click();
		//driver.findElement(By.tagName("a")).click();
		//driver.findElements(By.tagName("a")).get(0).click();
		//driver.findElement(By.xpath("//a[text()='Learn more about using Guest mode']")).click();
		driver.findElement(By.xpath("//*[text()='Learn more about using Guest mode']")).click();
	}
	
	@Test
	public void createAccount() throws InterruptedException
	{
		System.out.println("Test Case : Create Account");
		Thread.sleep(2000);
		//driver.findElements(By.className("VfPpkd-vQzf8d")).get(2).click();
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
