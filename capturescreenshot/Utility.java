package capturescreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.google.common.io.Files;

public class Utility {
	
	public static void capturescreenshots(WebDriver driver,String screenshotname) throws IOException{
		
		try {
			File srcfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 Files.copy(srcfile,new File("./Screenshots/"+screenshotname+".png"));//store in directory
		    System.out.println("screen taken");
		} catch (Exception e) {
			
			System.out.println("Exception while taking screenshot"+e.getMessage());
			}

		
	}

}
