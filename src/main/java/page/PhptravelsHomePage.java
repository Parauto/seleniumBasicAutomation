package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhptravelsHomePage  {
	WebDriver driver;
	By image = By.xpath("//img");
	By signButton = By.xpath("(//a[normalize-space(.)='Signup'])[3]");
	public void  phpMainpage(WebDriver driver) {
		this.driver = driver;
				
	}
public void clickPhpSignUp() {
	driver.findElement(signButton).click();
	
}
}