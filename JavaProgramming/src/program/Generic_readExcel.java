package program;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_readExcel {

	public static String getData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\sandeep\\Desktop\\Testdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet excel_sheet = book.getSheet(sheet);
		Row sheet_row = excel_sheet.getRow(row);
		Cell row_cell = sheet_row.getCell(cell);
		String value = row_cell.toString();
		
		return value;
	}
}