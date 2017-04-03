package myLibs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet1;

	public ExcelDataConfig(String excelPath) {
		// To Load the excel every time
		try {
			File fileLoc = new File(excelPath);
			FileInputStream fis = new FileInputStream(fileLoc);

			wb = new XSSFWorkbook(fis);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());

		}
	}

	public String getData(int sheetNumber, int row, int column) {
		sheet1 = wb.getSheetAt(sheetNumber);
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;

	}

}
