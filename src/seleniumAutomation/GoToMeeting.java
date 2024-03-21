package seleniumAutomation;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoToMeeting
{
	
	ChromeDriver driver = new ChromeDriver();
	@Test
	public void registerWithGoToMeeting()
	{
		driver.get("https://www.goto.com/meeting");
		driver.findElement(By.xpath("//img[@alt='close icon']")).click();
		driver.findElement(By.xpath("//a[@data-cta-name='Try Free']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Nag");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("K");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nag022@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Abcd@123");
	}

}
