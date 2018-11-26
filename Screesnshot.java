import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

//import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class Screesnshot {
	
//	public void getScreenshot(WebDriver driver, String imagepath)
//	{
//		EventFiringWebDriver eDriver = new EventFiringWebDriver(driver);
//		File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
//	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.google.com");
		 
		// Take screenshot and store as a file format
//		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File src=(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
		try {
		 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("D:/error.png"));
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }


	}

}
