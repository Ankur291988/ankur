package NG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class NewTest2 {
	
	
		  public  WebDriver driver ;
		   
		   

public class TestNG {
 
	public WebDriver driver;
 
  @Test
 
  public void main() {
 
	 driver.findElement(By.name("firstname")).sendKeys("Ankur");
 
 
  }
 
  @BeforeMethod
 
  public void beforeMethod() {
 
	  // Create a new instance of the Firefox driver
	  System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.11.1-win64\\geckodriver.exe");
      driver = new FirefoxDriver();
 
      //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
      //Launch the Online Store Website
 
      driver.get("http://toolsqa.wpengine.com/automation-practice-form");
 
  }
 
  @AfterMethod
 
  public void afterMethod() {
 
	  // Close the driver
 
      driver.close();
 
  }
 
}}