package seleniumAutomation;

import java.io.IOException;
import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Apsrtc_POM {
	
	//ChromeDriver driver = new ChromeDriver();
	//FirefoxDriver driver = new FirefoxDriver();
	//EdgeDriver driver = new EdgeDriver();
	WebDriver driver ;
	Actions actions ;
	ReadProperties rp;
	DriverUtilities dUtils;
	public Apsrtc_POM()
	{
		driver = new ChromeDriver(); // opens an empty google chrome browser - 1234
		actions = new Actions(driver); // 1234
		rp = new ReadProperties("Data/Apsrtc.properties");
		dUtils = new DriverUtilities(driver);
	}
	
	//****************Xpath ***********************
	
	String sourceCityXpath = "//input[@name='source']";
	String destinationCityXpath = "//input[@name='destination']";
	String calenderXpath = "//input[@name='txtJourneyDate']";
	String SearchBtnXpath = "//input[@name='searchBtn']";
	
	//*********************************************
	
	@Before
	public void launchApplication() throws IOException
	{		
		System.out.println("Test Case : Launch Apsrtc Application");
		driver.get(rp.readData("URL"));
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  // ImplicitWait
	}
	
	public WebElement returnWebElement1(String yourXpath)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement srcObj = driver.findElement(By.xpath(yourXpath));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(srcObj));
		return element;
	}
		
	
	@Test
	public void bookBusTicket()
	{
		System.out.println("Test Case : Book Bus Ticket");		
		dUtils.returnWebElement(sourceCityXpath).sendKeys("HYDERABAD");		
		//driver.findElement(By.xpath(sourceCityXpath)).sendKeys("HYDERABAD");
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		//driver.findElement(By.xpath(destinationCityXpath)).sendKeys("GUNTUR");
		dUtils.returnWebElement(destinationCityXpath).sendKeys("GUNTUR");
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		//driver.findElement(By.xpath(calenderXpath)).click();
		dUtils.returnWebElement(calenderXpath).click();
		selectJDate("12");
		//driver.findElement(By.xpath(SearchBtnXpath)).click();
		dUtils.returnWebElement(SearchBtnXpath).click();
	}
	
	@Test
	public void bookBusTicket_positive1()
	{
		System.out.println("Test Case : Book Bus Ticket");
		driver.findElement(By.xpath(sourceCityXpath)).sendKeys("HYDERABAD");
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath(destinationCityXpath)).sendKeys("GUNTUR");
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath(calenderXpath)).click();
		selectJDate("12");
		driver.findElement(By.xpath(SearchBtnXpath)).click();
	}
	
	@Test
	public void bookBusTicket_positive2()
	{
		System.out.println("Test Case : Book Bus Ticket");
		driver.findElement(By.xpath(sourceCityXpath)).sendKeys("HYDERABAD");
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath(destinationCityXpath)).sendKeys("GUNTUR");
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath(calenderXpath)).click();
		selectJDate("12");
		driver.findElement(By.xpath(SearchBtnXpath)).click();
	}
	public void selectJDate(String jdate) // 
	{
		driver.findElement(By.xpath("//a[text()='"+jdate+"']")).click();  // Dynamic xpath
	}
	
	

}
