package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Allbasic {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","A://Selenium//geckodriver-v0.11.1-win64//geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		/*String url = "http://www.store.demoqa.com";
		driver.get(url);
		String a1= driver.getPageSource();
		String a2 = driver.getCurrentUrl();
		String a3 = driver.getPageSource();
		String a4  = driver.getTitle();
		System.out.println(a1 + a2 + a3+a4);*/
		driver.navigate().to("http://toolsqa.wpengine.com/Automation-practice-form/");
		driver.findElement(By.name("firstname")).sendKeys("Ankur");
		driver.findElement(By.name("lastname")).sendKeys("Tiwari");
		
		}

}
