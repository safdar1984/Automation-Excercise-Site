package AutomationTestCases;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import TestComponents.BaseClass;

public class RegisterUser extends BaseClass{
	
	WebDriver driver = InitializeBrowser();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
	@Test
	public void UserFlow() {
		
		String newUserName = "David Anderson";
		Random random = new Random();
		int randomNumber = random.nextInt(100000);
		String userEmail = "abc"+randomNumber+"@abc.abc";
		String userPassword = "123456";
		driver.get("http://automationexercise.com");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/i[@class='fa fa-home']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Signup / Login"))).click();
		RegisterNewUser(newUserName, userEmail, userPassword);
		Login(userEmail, userPassword);
		
	}
	public void RegisterNewUser(String userName, String UserEmail, String userPassword) {
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[data-qa='signup-name']"))).sendKeys(userName);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[data-qa='signup-email']"))).sendKeys(UserEmail);
		driver.findElement(By.cssSelector("button[data-qa='signup-button']")).click();
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("password"))).sendKeys(userPassword);
		driver.findElement(By.cssSelector("input[data-qa='first_name']")).sendKeys("David");
		driver.findElement(By.cssSelector("input[data-qa='last_name']")).sendKeys("Anderson");
		driver.findElement(By.id("address1")).sendKeys("Street 3");
		driver.findElement(By.id("state")).sendKeys("Punjab");
		driver.findElement(By.id("city")).sendKeys("Pattoki");
		driver.findElement(By.id("zipcode")).sendKeys("06514");
		driver.findElement(By.id("mobile_number")).sendKeys("4561321546");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");

		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-qa='create-account']"))).click();		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[data-qa='continue-button']"))).click();		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/logout']"))).click();
		
		}
	
	public void Login(String userEmail, String password) {
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[data-qa='login-email']"))).sendKeys(userEmail);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[data-qa='login-password']"))).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
}
