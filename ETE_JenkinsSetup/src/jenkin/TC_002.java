package jenkin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TC_002 {

	@Test
	public void TS_001() {
	System.setProperty("webdriver.gecko.driver", "D:\\Java\\ETE_JenkinsSetup\\IEDriverServer");
	InternetExplorerDriver driver= new InternetExplorerDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("hello");
	driver.findElement(By.id("pass")).sendKeys("hello");
	driver.quit();
	}
}
