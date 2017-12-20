package package_Selenium;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver = new FirefoxDriver();
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      driver.navigate().to("http://www.calculator.net/");
      driver.manage().window().maximize();
      driver.findElement(By.xpath(".//*[@id='menu']/div[3]/a")).click();
	}

}
