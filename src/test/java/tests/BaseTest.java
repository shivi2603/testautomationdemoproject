package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public WebDriver driver;

	@BeforeTest
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\configuration\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@BeforeClass
	public void maximizeWindow() {
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
