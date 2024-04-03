package seleniumAutomation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApsrtcAutomation
{
	
	ChromeDriver driver = new ChromeDriver(); // 1234
	Actions actions = new Actions(driver);
	
	@Before
	public void launchApplication()
	{
		System.out.println("Test Case : Launch Apsrtc Application");
		//driver.get("https://www.apsrtconline.in/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  // ImplicitWait
	}
	
	@Test
	public void bookBusTicket() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement srcObj = driver.findElement(By.xpath("//input[@name='source']"));
		wait.until(ExpectedConditions.elementToBeClickable(srcObj)).sendKeys("HYDERABAD");
		//Thread.sleep(30000);
		System.out.println("Test Case : Book Bus Ticket");
		//driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		driver.findElement(By.xpath("//a[text()='31']")).click();
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	}
	
	@Test
	public void bookBusTicket_positive()
	{
		System.out.println("Test Case : Book Bus Ticket");
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		selectJDate("12");
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	}
	
	//Absolute 
	
	public void selectJDate(String jdate) // 
	{
		driver.findElement(By.xpath("//a[text()='"+jdate+"']")).click();  // Dynamic xpath
	}
	
	//org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
	
	
	@Test
	public void handleMultipleWindows() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@title='TimeTable / Track']")).click();
		driver.findElement(By.xpath("//a[text()='All services Time Table & Tracking']")).click();
		Set<String> windows = driver.getWindowHandles();
		ArrayList<String>  allwindows = new ArrayList<String>(windows);		
		int cnt = allwindows.size();
		System.out.println("Count :" + cnt);
		System.out.println(allwindows.get(0));
		System.out.println(allwindows.get(1));
		System.out.println("Title of first window :" + driver.getTitle());
		driver.switchTo().window(allwindows.get(1));
		Thread.sleep(2000);
		System.out.println("Title of second window :" + driver.getTitle());
		driver.close(); // it will close the current active window
		//driver.quit(); // it will kill the driver process / object
		driver.switchTo().window(allwindows.get(0));	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Home']")).click();
		//driver.quit();
	}
	
	
	
	
	
	
	
	
	
	

}
