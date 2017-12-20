package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hover {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","A://Selenium//geckodriver-v0.11.1-win64//geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		String url = "http://zenloungeplus.zensar.com/";
		 driver.get(url);
		 driver.findElement(By.id("closeButton")).click();
		 driver.findElement(By.xpath(".//*[@id='_58_uName']")).sendKeys("at47459");
		 driver.findElement(By.xpath(".//*[@id='_58_password']")).sendKeys("Discovery@123");
		 driver.findElement(By.xpath(".//*[@id='yui_patched_v3_11_0_1_1496933601601_183']")).click();
		 
		// TODO Auto-generated method stub

	}

}
