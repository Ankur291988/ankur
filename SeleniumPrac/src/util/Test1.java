package util;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class Test1 {
	WebDriver driver;
  @Test
  public void f() {
	  System.out.println("Test");
	  String title = driver.getTitle();
	  System.out.println(title);
	  String url = driver.getCurrentUrl();
	  System.out.println(url);
	  //System.out.println(driver.getPageSource());
	  driver.findElement(By.name("firstname")).sendKeys("Ankur");
	  driver.findElement(By.name("lastname")).sendKeys("Tiwari");
	  driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/input[2]"));
	 
	  //System.out.println("Link Test Pass");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //driver.navigate().back();
	 // driver.findElement(By.partialLinkText("Partial"));
	   List <WebElement> oradio = driver.findElements(By.xpath(".//*[@id='sex-0']"));
	   int size = oradio.size();
	   for(int i = 0;i<size;i++){
		   String value = oradio.get(i).getAttribute("value");
		   if(value.equalsIgnoreCase("male")){
			   oradio.get(i).click();
		   }
	   }
	   List<WebElement> yrsofexp = driver.findElements(By.name("exp"));
	   boolean yvalue ;
	   yvalue = yrsofexp.get(0).isSelected();
	   System.out.println(yvalue);
	   if(yvalue == false) {
		   yrsofexp.get(6).click();
	   }
	 WebElement  dropdown = driver.findElement(By.id("continents"));
	   Select oselect = new Select(dropdown);
	   List<WebElement> isize = oselect.getOptions();
	   for(int i =0;i<isize.size();i++){
		  String value =  isize.get(i).getText();
		   System.out.println(value);
		   if(value.equals("Africa")){
			   oselect.selectByVisibleText("Africa");
		   }
	   }
	 Select iselect = new Select(driver.findElement(By.id("selenium_commands")));
	 List<WebElement> iaSize = iselect.getOptions();
	 for(int i=0;i<iaSize.size();i++){
		 String ivalue = iaSize.get(i).getText();
		 if(ivalue.equalsIgnoreCase("Switch Commands")){
			 iselect.selectByIndex(2);
			 iselect.selectByIndex(4);
			 iselect.selectByVisibleText("Wait Commands");
			 
		 }
	 }
	 
	 driver.findElement(By.linkText("Link Test")).click();
	 String element = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
	 System.out.println(element);
	 driver.navigate().back();
	 
	 driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
	 String handle = driver.getWindowHandle();
	 driver.findElement(By.name("New Message Window")).click();
	 System.out.println(handle);
	 Set<String> handles = driver.getWindowHandles();
	 System.out.println(handles);
	 for(String temp : handles){
		 System.out.println(temp);
		 driver.switchTo().window(temp);
		 
	 }
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforTest");
	  System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
