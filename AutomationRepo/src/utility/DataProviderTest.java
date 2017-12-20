package utility;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

public class DataProviderTest {
	private static WebDriver driver = null;
	
	@DataProvider(name = "Authentication")
  public static Object[][] Auth() {
    return new Object[][] {{ "Ankur", "Test@123" },{ "Abc", "Test@1" }};
	}
    
    @Test(dataProvider = "Authentication")
    	 public void Test(String Username, String Password) {
    	driver = new FirefoxDriver();
    	driver.get("http://store.demoqa.com");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElement(By.xpath(".//*[@id='account']/a")).click();
    	driver.findElement(By.xpath(".//*[@id='log']")).sendKeys(Username);
    	driver.findElement(By.xpath(".//*[@id='pwd']")).sendKeys(Password);
    	driver.findElement(By.xpath(".//*[@id='login']")).click();
    	driver.quit();
    	   	
    	  }
   
  }
