import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.guru99.com/scroll-up-down-selenium-webdriver.html");
		String a = driver.getWindowHandle();
		System.out.println(a);
		WebElement e = driver.findElement(By.id("slidetag"));
//		Scroll to 1000 pixel
//		js.executeScript("window.scrollBy(0,1000)");
//		scroll to webelement
		js.executeScript("arguments[0].scrollIntoView();",e);
//		driver.close();
	}

}
