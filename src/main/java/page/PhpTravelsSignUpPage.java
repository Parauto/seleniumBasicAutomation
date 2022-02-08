package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PhpTravelsSignUpPage {
	WebDriver driver;
	By firstName = By.xpath("//input[@class=\"form-control\"][@name=\"first_name\"]");
	By lastName = By.xpath("//input[@class=\"form-control\"][@name=\"last_name\"]");
	By phone = By.xpath("//input[@class=\"form-control\"][@name=\"phone\"]");
	By mail = By.xpath("//input[@class=\"form-control\"][@name=\"email\"]");
	By psword = By.xpath("//input[@class=\"form-control\"][@name=\"password\"]");
	By acntType = By.cssSelector("span#select2-account_type-container");
	By button = By.cssSelector("span.ladda-label");

	public void phpMainpage(WebDriver driver) {
		this.driver = driver;
	}

	public void firstname() {
		 driver.findElement(firstName).sendKeys("parveen");
	}
	public void lstname() {
	 driver.findElement(lastName).sendKeys("md");
	}
	public void phn() {
		 driver.findElement(phone).sendKeys("9346827808");
	}
	public void email() {
	 driver.findElement(mail).sendKeys("parveenmd9@gmail.com");
	}
	public void password() {
	driver.findElement(psword).sendKeys("nida@rehan1");
	}
	public void acnt() {
		WebElement acnt = driver.findElement(acntType);
		Select select =new Select(acnt);
	select.selectByVisibleText("select2-account_type-container");
		
	
	}
}
