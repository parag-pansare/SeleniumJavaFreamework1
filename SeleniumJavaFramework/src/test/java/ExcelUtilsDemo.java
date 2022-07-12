
public class ExcelUtilsDemo {

	public static void main(String[] args) {
		ExcelUtils excel = new ExcelUtils("D:\\Selenium\\SeleniumJavaFramework\\Excel\\data.xlsx", "Sheet1");
		excel.getRowCount();
		excel.getColCount();
		excel.getCelldataString(0, 0);
		excel.getNumericCelldata(1, 1);
	}

}
