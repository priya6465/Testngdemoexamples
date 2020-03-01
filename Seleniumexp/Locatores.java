package Seleniumexp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locatores {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.d"+ "river", "F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
         driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
         //driver.findElement(By.linkText("Create account")).click();

         driver.findElement(By.partialLinkText("Create account ")).click();
       Thread.sleep(500);
         driver.quit();
	}
	
}

	
