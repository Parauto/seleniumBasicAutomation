package scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import reUsable.DriverManager;

public class DragAndDropTest extends BaseTest {
	@Test
	public void verifyDragAndDrop() {
		// System.out.println(System.getProperty("user.name"));
//		System.out.println(System.getProperty("os.name"));
//		String userDir = System.getProperty("user.dir");
//		System.out.println(userDir);
//		String chromeDriver = userDir+"//src/test/resources/drivers/chromedriver.exe";
//		System.out.println(chromeDriver);
//		System.setProperty("webdriver.chrome.driver", chromeDriver);
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	  or 
		// WebDriver driver = DriverManager.getDriver("edge"); this one before extend
		// BaseTest.

		WebDriver driver = this.getDriver();
		driver.get("https://jqueryui.com/droppable/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe[class='demo-frame']")));
		WebElement draggableElement = driver.findElement(By.cssSelector("div[id='draggable']"));
		WebElement droppableElement = driver.findElement(By.cssSelector("div[id='droppable']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(draggableElement, droppableElement).build().perform();
		DriverManager.tearDown(driver);
	}
}
