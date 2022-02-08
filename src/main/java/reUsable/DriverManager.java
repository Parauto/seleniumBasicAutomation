package reUsable;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;


public  class DriverManager {
	public static WebDriver getDriver(String browserName) {
		String userDir = System.getProperty("user.dir");
		String driverPath = null;
		WebDriver driver = null;
		switch (browserName.toLowerCase()) {
		case "chrome":
			driverPath = userDir + "//src/test/resources/drivers/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			break;
		case "firefox":
			driverPath = userDir + "src/test/resources/drivers/geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", driverPath);
			driver = new FirefoxDriver();
			break;
		case "ie":
			driverPath = userDir + "src/test/resources/drivers/IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", driverPath);
			driver = new InternetExplorerDriver();
			break;
		case "edge":
			driverPath = userDir + "/src/test/resources/drivers/msedgedriver.exe";
			System.setProperty("webdriver.edge.driver", driverPath);
			driver = new EdgeDriver();
			break;
		default:
			break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Reporter.log("########launching......"+browserName, true);
		return driver;
	}
	public static void tearDown(WebDriver driver) {
		driver.quit();
		System.out.println("##### closing broser######");
	}
}


