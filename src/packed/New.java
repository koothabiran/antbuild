package packed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class New {
	public static WebDriver driver;
	public static String URL="https://www.flipkart.com/";
	 
  @Test(priority=1)
  public void openbrowser() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Koothabiran\\eclipse-workspace\\study\\drivers\\chromedriver (2).exe");
	 driver = new ChromeDriver();
	  driver.get(URL);
	  driver.manage().window().maximize();
	 Thread.sleep(2000);
	 
	 driver.close();
	  
	  
  }
}
