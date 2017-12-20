package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utility.ExcelUtil;
public class Module {

	public static void main(String[] args) throws Exception {
		ExcelUtil.setExcel("C:\\Users\\Ankur\\Desktop\\TestData.xlsx");
		String FirstName = ExcelUtil.getCelldata(1,0);
		String Lastname = ExcelUtil.getCelldata(1,1);
		System.out.println(FirstName);
		System.out.println(Lastname);
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		String url = "http://toolsqa.com/automation-practice-form/";
		driver.get(url);
		driver.findElement(By.name("firstname")).sendKeys(FirstName);
		driver.findElement(By.name("lastname")).sendKeys(Lastname);
		ExcelUtil.setCellData("Pass", 5, 3);

	}

}