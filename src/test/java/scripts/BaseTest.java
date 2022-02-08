package scripts;

import org.testng.annotations.Test;

import reUsable.DriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest {
 
	private WebDriver driver;
	
  public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

@BeforeMethod
  public void beforeMethod() {
	  driver = DriverManager.getDriver("chrome");
  }

 // @AfterMethod
 // public void afterMethod() {
	//DriverManager.tearDown(driver);
  //}

}
