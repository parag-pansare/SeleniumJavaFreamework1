import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Demo {

	static WebDriver driver= null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DesiredCapabilities var = new DesiredCapabilities();
		var.setCapability("ignoreProtectedModeSettings", true);
		
		String ProjectPath= System.getProperty("user.dir");	
		System.setProperty("webdriver.chrome.driver", ProjectPath+"/Drivers/ChromeDriver/chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("A b c d e");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);	
		driver.close();
		driver.quit();
	}


}
