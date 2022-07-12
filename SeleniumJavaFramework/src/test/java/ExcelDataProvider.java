import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {

	WebDriver driver;
	
	@Test(dataProvider = "test1data")
	public void test1(String Username, String Pass) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\SeleniumJavaFramework\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.findElement(By.id("username")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(Pass);
		
		System.out.println(Username + " : " + Pass);
		driver.close();
	}

	@DataProvider(name = "test1data")
	public Object[][] getData() {

		Object data[][]= testData("D:\\Selenium\\SeleniumJavaFramework\\Excel\\data.xlsx", "Sheet1");
		return data;
	}

	public Object[][] testData(String excelPath, String sheetName) {

		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);

		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();

		Object data[][] = new Object[rowCount-1][colCount];

		for(int i=1; i<rowCount ;i++) {
			for(int j=0; j<colCount; j++) {
				String celldata = excel.getCelldataString(i, j);
				System.out.print(celldata+ "  |  ");
				data[i-1][j]= celldata;
			}
			System.out.println();
		}
		return data;
	}


}
