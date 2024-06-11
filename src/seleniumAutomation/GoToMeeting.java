package seleniumAutomation;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GoToMeeting
{
	//Actions : Mouse Hover , Click , Double Click , Right click , Pause , sendkeys 
	
	//WebElement class : click , incase if this click is not working then we can go for Click function from Actions class
	
	WebDriver driver ;
	@Test
	public void allBrowsers()
	{
		//driver = new ChromeDriver();
		
		driver.get("https://www.goto.com/meeting");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='close icon']")).click();
	}
	
	
	
	@Test
	public void registerWithGoToMeeting() throws InterruptedException
	{
		driver.get("https://www.goto.com/meeting");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='close icon']")).click();
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		//Every function in actions class will return the object of actions class again
		WebElement tryfree = driver.findElement(By.xpath("//a[@data-cta-name='Try Free']"));
		actions.moveToElement(tryfree).click().build().perform();
		driver.findElement(By.xpath("//img[@alt='close icon']")).click();
		//driver.findElement(By.xpath("//a[@data-cta-name='Try Free']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Nag");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Kothapalli");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nag022@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Abcd@123");		
		WebElement companysize = driver.findElement(By.xpath("//select[@id='CompanySize']"));
		actions.moveToElement(companysize).build().perform();
		Thread.sleep(2000);
		Select myselect = new Select(companysize);
		myselect.selectByIndex(2);
		Thread.sleep(2000);
		myselect.selectByVisibleText("250 - 499");		
		WebElement startBtn = driver.findElement(By.xpath("//button[text()='Start for Free']"));
		actions.moveToElement(startBtn).pause(Duration.ofSeconds(2)).click().build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Activation Code']")).sendKeys("12345");
		
		String text1 = driver.findElement(By.xpath("//button[text()='Verify']")).getText();
		
		By byobj = By.xpath("//button[text()='Verify']");
		WebElement verifyBtn = driver.findElement(byobj);
		
		String tagName = verifyBtn.getTagName();
		
		System.out.println("TagName :" + tagName );
		
		String text2 = verifyBtn.getText();
		
		System.out.println("Text on the object :" + text2);
		
		String classAttribute = verifyBtn.getAttribute("class");
		
		System.out.println("Calss Att :" + classAttribute );
		
		System.out.println(verifyBtn.isDisplayed());
		System.out.println(verifyBtn.isEnabled());
		
		if(verifyBtn.isDisplayed()  && verifyBtn.isEnabled())
		{
			driver.findElement(By.xpath("//button[text()='Verify']")).click();
		}
		else
		{
			System.out.println("Verfiy Button is not Enabled");
		}
		
				
	}
	
	public void getFunctions()
	{
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
