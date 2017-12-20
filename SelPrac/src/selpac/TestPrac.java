package selpac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestPrac {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		String url = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(url);
		Select oselect = new Select(driver.findElement(By.id("continents")));
		List<WebElement> obj = oselect.getOptions();
		int size = obj.size();
		for(int i=0;i<size;i++){
			String str= obj.get(i).getText();
			System.out.println(str);
		}
		
			
			
			}
		}
		
		
		