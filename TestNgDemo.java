import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgDemo {
	@BeforeMethod
	public void preCondition()
	{
		Reporter.log("Login",true);
		
	}
	@AfterMethod
	public void postCondition()
	{
		Reporter.log("Logout",true);
		
	}	
	@Test
	public void testA()
	{
		Reporter.log("Create",true);
		
	}
	@Test(invocationCount=5)
	public void testB()
	{
		Reporter.log("delete",true);
		
	}

}
