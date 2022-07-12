package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.GoogleSearchPage;

public class TestNG_Demo {
	WebDriver driver = null;

	@BeforeTest 
	public void setUpTest(){
		String ProjectPath= System.getProperty("user.dir");	
		System.setProperty("webdriver.chrome.driver", ProjectPath+"/Drivers/ChromeDriver/chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void googleSearch() throws InterruptedException {

		GoogleSearchPage searchPageObj= new GoogleSearchPage(driver);

		driver.get("https://google.com");
		searchPageObj.enterTextInSearchBox("A B C");
		Thread.sleep(5);
		searchPageObj.clickSearchButton();	
	}

	@Test
	public void googleSearch2() throws InterruptedException {

		GoogleSearchPage searchPageObj= new GoogleSearchPage(driver);

		driver.get("https://google.com");
		searchPageObj.enterTextInSearchBox("amazon");
		Thread.sleep(5);
		searchPageObj.clickSearchButton();	
	}


	@AfterTest
	public void tearDownTest(){
		driver.close();
		driver.quit();
		System.out.println("Test successfull");
	}

}
