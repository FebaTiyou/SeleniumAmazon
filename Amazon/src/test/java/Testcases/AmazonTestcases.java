package Testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AutomationCore.BaseClass;

public class AmazonTestcases extends BaseClass{
//ctrl +k click on baseClass - navigates to baseclass
	
	public WebDriver driver ;
	
	@BeforeMethod
	//to run before all testcase
	public void initialization() throws Exception
	{
		//method to call driver from parent class
		//driver value gets stored as chrome
		
		driver = browserInitialization("chrome");
		driver.get("https://www.amazon.in/");//to navigate to the url
	
	}
	@Test
	//for each testcase we give @test annotation 
	public void TC_01()
	{
		//driver.navigate().to("https://www.flipkart.com/");//to navigate to another url
		//driver.navigate().back();
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.name("email")).sendKeys("febazachariahnew@gmail.com");
		driver.findElement(By.className("a-button-input")).click();
		//driver.findElement(By.linkText("Forgot Password")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		//driver.navigate().forward();
		//driver.navigate().refresh();
		//driver.quit();
		//driver.close();
	}
	
	//no main method as TestNg 
	//complier checks for main method but as Testng handles the complier  
}
