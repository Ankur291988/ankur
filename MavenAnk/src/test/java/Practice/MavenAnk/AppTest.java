//package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTest {

	public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.11.1-win64\\geckodriver.exe");
			WebDriver driver =new FirefoxDriver();
			String url = "http://store.demoqa.com/";
			 driver.get(url);
			 String Title = driver.getTitle();
		System.out.println("The Title is:" +Title);
		int Titlelength = driver.getTitle().length();
		System.out.println("The TitleLength is:" +Titlelength);
		String pageurl = driver.getCurrentUrl();
		
		if (pageurl.equalsIgnoreCase(url))
			System.out.println("Verification passed");
		else
			System.out.println("Verification failed");
		System.out.println("Expected url: " +pageurl);
		System.out.println("Actual url: " +url);
		String pagesource= driver.getPageSource();
		//System.out.println("The pagesource:" +pagesource);
		
		int pagesourcelingth = driver.getPageSource().length();
		//System.out.println("The pagesourcelenght is :" +pagesourcelingth);
		//driver.quit();
		

	}

}