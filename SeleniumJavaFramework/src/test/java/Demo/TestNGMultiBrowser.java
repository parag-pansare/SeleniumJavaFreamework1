package Demo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestNGMultiBrowser {

	WebDriver driver = null;

	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		System.out.println("Browsername is : " + browserName);

		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\SeleniumJavaFramework\\Drivers\\ChromeDriver\\chromedriver.exe" );
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\SeleniumJavaFramework\\Drivers\\Firefox\\geckodriver.exe" );
			driver = new FirefoxDriver();
		}
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://google.com");	
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("abcd");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Test completed successfully");
	}
}
