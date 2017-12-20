package utility;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class RealTest {
	WebDriver driver;
  @Test(dataProvider = "Auth")
  public void test(String Uname, String Password) {
	  driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/input[1]")).sendKeys(Uname);
	driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/input[2]")).sendKeys(Password);
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		String url = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(url);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }


  @DataProvider
  public Object[][] Auth() throws Exception {
	  try{
		  Object[][] obj = ExcelUtil.getTabArray("C://Selenium//workspace//Automate//src//utility//TestData.xlsx", "Sheet1");
		 return (obj);
		  	  }catch (Exception e){
		  throw (e);
		  
	  }
		  
  }
  
}
    