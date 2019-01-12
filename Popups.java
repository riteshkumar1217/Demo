import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		String a = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id="content"]/p[4]/button")).click();
		driver.switchTo().alert().accept();
		driver.close();

	}

}
