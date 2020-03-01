package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	private static WebDriver driver =null;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");

		driver= new ChromeDriver();	
		
	 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");


	 Login.txt_UserName(driver).sendKeys("Admin");
	 Login.txt_Password(driver).sendKeys("admin123");
	 Login.btn_Login(driver).click();
	 
	 

	}

}
