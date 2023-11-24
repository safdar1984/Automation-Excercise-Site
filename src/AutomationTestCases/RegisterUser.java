package AutomationTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import TestComponents.BaseClass;

public class RegisterUser extends BaseClass{
	
	WebDriver driver = InitializeBrowser();
	@Test
	public void Login() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
		driver.get("http://automationexercise.com");
		System.out.println("Getting in here!");
	//	wait.until(ExpectedConditions.elementToBeClickable())
	}
}
