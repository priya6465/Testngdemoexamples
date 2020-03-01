package Seleniumexp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assercondition {
static WebDriver driver;
@Test(timeOut=1000)
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/register/"); 
		
		WebElement b1=driver.findElement(By.id("submitButton"));
		Assert.assertTrue(b1.isDisplayed());
		System.out.println("Assertion passed successful");
		
		Thread.sleep(2000);
		driver.close();
 
}
}