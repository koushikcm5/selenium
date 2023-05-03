package d7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ce5 {
    static WebDriver driver;
	@BeforeSuite
	public static void Set() {
	    EdgeOptions ed= new EdgeOptions();
		driver=new EdgeDriver(ed);
	}
	
  @Test
  public void Testcase01() {
	  driver.get("https://www.godaddy.com");
	  driver.manage().window().maximize();
	  Assert.assertEquals(driver.getTitle(),"Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN");
	  Assert.assertEquals(driver.getCurrentUrl(),"https://www.godaddy.com/en-in" );	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  driver.close();
  }
}