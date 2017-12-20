package test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

public class dataprovider {
  @Test(dataProvider = "Authentication")
  public void testng(String uname, String pwd) {
	  System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		String url = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(url);
		
	  
  }

  @DataProvider(name = "Authentication")
  public Object[][] auth() {
    return new Object[][] {
      new Object[] { "Ankur", "Tiw" },
      new Object[] { "Ankit", "Ti" },
    };
  }
}
