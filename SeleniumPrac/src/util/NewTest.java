package util;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver;
  @Test
  public void main() {
	  driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/input[1]")).sendKeys("Ankur");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		driver =new FirefoxDriver();
		//String url = "http://toolsqa.com/automation-practice-form/";
		driver.get("http://toolsqa.com/automation-practice-form/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}