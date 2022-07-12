import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) {
		String ProjectPath= System.getProperty("user.dir");
		System.out.println(ProjectPath);
		
		System.setProperty("webdriver.chrome.driver", ProjectPath+"/Drivers/ChromeDriver/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://google.com");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		driver.quit();
	}
	
}
