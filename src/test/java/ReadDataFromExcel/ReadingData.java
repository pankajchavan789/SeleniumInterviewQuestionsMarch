package ReadDataFromExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		int totalrow=sheet.getLastRowNum();
		
		int totalcell=sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total rows are :"+totalrow);
		System.out.println("Total cell are :"+totalcell);
		
		

	}

}
