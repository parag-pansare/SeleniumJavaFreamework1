import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtils(String excelPath, String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);

		}catch(Exception e) {
			System.out.println(e.getMessage());		
		}
	}

	public static void main(String[] args) {
		getRowCount();
		getColCount();
		getCelldataString(0,0);
		getNumericCelldata(1,1);
	}

	public static int getRowCount() {
		int rowCount=0 ;
		
		try {
			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows is : "  +rowCount);

		} catch(Exception exp) {
			System.out.println(exp.getMessage());
			exp.getCause();
			exp.getStackTrace();
		}
	return rowCount;	
	}

	public static int getColCount() {
		int colCount=0 ;
		
		try {
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of cols is : "  +colCount);

		} catch(Exception exp) {
			System.out.println(exp.getMessage());
			exp.getCause();
			exp.getStackTrace();
		}
	return colCount;	
	}
	
	
	public static String getCelldataString(int rowNum, int columnNum) {
		String CellData= null;
		try {
			CellData = sheet.getRow(rowNum).getCell(columnNum).getStringCellValue();
			//System.out.println("This is cell data  :  " +CellData);

		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			exp.getCause();
			exp.getStackTrace();
		}
		return CellData;
	}

	public static void getNumericCelldata(int rowNum, int columnNum) {
		try {
			Double CellData = sheet.getRow(rowNum).getCell(columnNum).getNumericCellValue();
			System.out.println("This is numeric cell data  :  " +CellData);

		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			exp.getCause();
			exp.getStackTrace();
		}
	}
}
