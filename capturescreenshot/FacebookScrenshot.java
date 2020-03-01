package capturescreenshot;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.google.common.io.Files;

public class FacebookScrenshot {
	@Test
	public void Captureshot() throws Exception
	{
		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		  
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Utility.capturescreenshots(driver, "Browser satred");
		
		driver.findElement(By.xpath("//input[@name='email' and @type='email']")).sendKeys("Priyankaravi@gmail.com");
		Utility.capturescreenshots(driver, "typeusername");
		
		driver.findElement(By.xpath("//input[@id='pass'and @type='password']")).sendKeys("39027507");
		
		driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
		
		File srcfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	  Files.copy(srcfile,new File("./Screenshots/face.png"));//store in directory

//	Files.copy(srcfile,new File("F:\\seleniumVideos\\fac.png")); //store in drive
//		 
	 System.out.println("Taken Sceeenshot");
//		
		driver.quit();
	
}
}