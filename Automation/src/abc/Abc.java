package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Abc {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		String url = "http://store.demoqa.com/";
		driver.get(url);
	String Title = driver.getTitle();
	}

}
