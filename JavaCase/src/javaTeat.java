import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class javaTeat {
	 
	 
	 
    public static void main(String[] args) {


            System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.11.1-win64\\geckodriver.exe");
           
            // if above property is not working or not opening the application in browser then try below property

           //System.setProperty("webdriver.firefox.marionette","G:\\Selenium\\Firefox driver\\geckodriver.exe");

          WebDriver driver = new FirefoxDriver();

          driver.get("http://www.facebook.com");

          System.out.println("Application title is ============="+driver.getTitle());

          driver.quit();

    }



}