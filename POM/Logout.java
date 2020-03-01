package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout {

	private static WebElement element =null;
	public static WebElement Welcome (WebDriver driver) {
		element=driver.findElement(By.id("Welcome"));
		return element;
	}
	public static WebElement lnk_LogOut(WebDriver driver) {
		element=driver.findElement(By.linkText("Logout"));	
		return element;
	}
	

	}


