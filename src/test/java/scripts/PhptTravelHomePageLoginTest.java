package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import page.PhptravelsHomePage;


public class PhptTravelHomePageLoginTest extends BaseTest  {
  

@Test
  public void verifyLogin() {
	  WebDriver driver= this.getDriver();
	  driver.get("https://www.phptravels.net/");
	  PhptravelsHomePage home = new PhptravelsHomePage();
	 home.clickPhpSignUp();

	 
	}

}
