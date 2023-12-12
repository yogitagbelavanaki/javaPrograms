package program;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// step-1 specify the path of excel sheet
		FileInputStream fis=new FileInputStream("C:\\Users\\sandeep\\Desktop\\Testdata.xlsx");

		// step-2 open excel 
		Workbook book = WorkbookFactory.create(fis);
		
		// step-3 specify sheet name
		Sheet sheet = book.getSheet("Sheet1");
		
		// step-4 specify row count
		Row row = sheet.getRow(1);
		
		// step-5 specify cell count
		Cell cell = row.getCell(1);
		
		// step-6 fetch data
		 String value = cell.toString();
		System.out.println(value);
	}
}