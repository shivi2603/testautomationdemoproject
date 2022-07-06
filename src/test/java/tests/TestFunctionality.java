package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFunctionality extends BaseTest {

	@Test
	public void autoDemo() {
		System.out.println("testNg is working");
	}

	@Test
	public void fillRegistrationForm() {
		driver.findElement(By.xpath("//div[text()='Elements']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Web Tables']")).isDisplayed());
	}
}
