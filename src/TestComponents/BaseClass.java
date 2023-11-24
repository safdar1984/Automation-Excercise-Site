package TestComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver InitializeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sra\\Downloads\\chromedriver-win64-118\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		//  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sra\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();

		 
		//System.setProperty("webdriver.edge.driver",
		//		"C:\\Users\\sra\\Downloads\\edgedriver_win64 (5)\\msedgedriver.exe");
		//EdgeOptions options = new EdgeOptions();

		options.addArguments("--remote-allow-origins=*");

	    WebDriver driver = new ChromeDriver(options);
	//	WebDriver driver = new EdgeDriver(options);
		driver.manage().window().maximize();
		return driver;

	}
}
