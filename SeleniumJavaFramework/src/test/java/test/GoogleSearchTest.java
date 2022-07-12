package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.GoogleSearchPage;

public class GoogleSearchTest {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearch(); 
		
}
	
	public static void googleSearch() {
		String ProjectPath= System.getProperty("user.dir");	
		System.setProperty("webdriver.chrome.driver", ProjectPath+"/Drivers/ChromeDriver/chromedriver.exe" );
		driver = new ChromeDriver();
		
		GoogleSearchPage searchPageObj= new GoogleSearchPage(driver);
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		searchPageObj.enterTextInSearchBox("A B C D E");
		searchPageObj.clickSearchButton();
		driver.close();
		
	}
	
}
