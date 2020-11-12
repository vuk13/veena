package generic;

import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	
	public class basetest implements Framework
	{
		public WebDriver driver;
		@BeforeMethod
		public void openAppln()
		{
			System.setProperty(GECKO_KEY,GECKO_VALUE);
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.get("http://localhost/login.do");
		}
		@AfterMethod
		public void closeAppln()
		{
			
		driver.quit();
		}

	}
