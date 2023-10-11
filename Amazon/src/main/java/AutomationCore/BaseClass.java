package AutomationCore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	//browser invoking code
	
	//globally declaring a driver object 
	//the return type of driver is webdriver.
	
	public WebDriver driver ;
	
	public WebDriver browserInitialization(String browserName) throws Exception
	{
		//initialising chromedrive
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();//chrome broswer invoking 
			//System.setProperty("webdriver.chrome.driver","path of the chromedriver\\chromedriver.exe");
			//this method is to set the path of driver ,in old method
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();//Edge broswer invoking
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();//firefox broswer invoking
		}
		else
		{
			throw new Exception("Invalid name exception");
		}
		
		//return the driver 
		return driver;
	}

}
