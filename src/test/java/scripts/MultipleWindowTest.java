package scripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import reUsable.DriverManager;

public class MultipleWindowTest {
  @Test
  public void verifyMultipleWindow() {
	  WebDriver driver = DriverManager.getDriver("Chrome");
	  driver.get("https://www.freshworks.com");
		String mainWindow = driver.getWindowHandle();// to handle  single window
		//System.out.println(mainWindow);
		String[] windowsArray = new String[2];
		driver.findElement(By.xpath("//a[normalize-space(.)='FREE TRIALS']")).click();
		switchToContactWindow(driver, mainWindow);
//	WebElement heading= driver.findElement(By.xpath("//h1[normalize-space(.)= 'The customer and employee delight engine you deserve']"));
//		System.out.println(heading.isDisplayed()); or
		System.out.println(driver.findElement(By.xpath("//h1[normalize-space(.)= 'The customer and employee delight engine you deserve']")).isDisplayed());
		driver.close();//the window where we are now will be closed.
	//driver.quit();//total windows will closed.
		DriverManager.tearDown(driver);
  }
public static void switchToContactWindow(WebDriver driver, String mainWindow) {
	Set<String> windows = driver.getWindowHandles(); // to handle sub windows
	for (String window : windows) {
		if (!window.equalsIgnoreCase(mainWindow)) {
			driver.switchTo().window(window);
		}
	}
}
}