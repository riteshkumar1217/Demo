import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Demo {
	 
	public void Ddemo(String name,int age)
	{
		System.out.println("Name is :"+name);
		System.out.println("age is:"+age);
	}
	public static void main(String [] args)
	{
	System.out.println("Print git status");
	System.out.println("second commit");
	FirefoxProfile profile = new FirefoxProfile();
	profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
	profile.setPreference("browser.download.folderList", 2);
	profile.setPreference("browser.download.dir", "d:\\");
	WebDriver driver = new FirefoxDriver((Capabilities) profile);
		Chrome Browser initialize
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		
	Demo d =new Demo();
	d.Ddemo("Riteshjhhh",26);
	//		

	
	

}
}