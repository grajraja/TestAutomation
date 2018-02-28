package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class LearnExcel {
	public Object[][] readData(String fileName) throws IOException {
		//Goto file location
		FileInputStream fis = new FileInputStream(new File("./snapshots/"+fileName+".xlsx"));
		//Open workbook
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		//Goto sheet
		XSSFSheet sheet = wbook.getSheet("work");
		//Goto the row
		/*int physicalNum = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalNum);*/
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		//Goto the cell
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);
		//Read the data
		String[][] data = new String[rowCount][columnCount];
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i-1][j] = cell.getStringCellValue();
			}
		}wbook.close();
		return data;
	}
}