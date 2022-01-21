package reUsable;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UIInteraction {

	// typetext - 1
	// clearText -- 1
	// clickOn - 1
	// checkOncheck -- 1
	// Select -- 3

	public static void type(WebDriver driver, String text, WebElement wb) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(wb));
		System.out.println("Typing " + text + " into the wb " + wb);
		wb.clear();
		wb.sendKeys(text);
	}

	public static void checkWb(WebDriver driver, WebElement wb) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(wb));
		System.out.println("Selecting checkbox with " + wb);
		if (wb.isSelected()) {
			System.out.println("checkbox is already selected ");
		} else {
			wb.click();
			System.out.println(wb + " is marked as selected");
		}
	}

	public static void click(WebDriver driver, String elementName, WebElement wb) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(wb));
		wait.until(ExpectedConditions.elementToBeClickable(wb));
		System.out.println("Clicking on " + elementName + " into the wb " + wb);
		wb.click();
	}

}
