package program;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteSingleDataIntoExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// step1-> specify path of excel
		FileInputStream fis=new FileInputStream("C:\\Users\\sandeep\\Desktop\\Testdata.xlsx");
		// step2-> open excel
		Workbook book = WorkbookFactory.create(fis);
		// step3-> specify the sheet name
		Sheet sheet = book.getSheet("Sheet1");
		// step4-> open row in excel
		Row row = sheet.createRow(2);
		// step5-> open cell in excel
		Cell cell = row.createCell(5);
		// step6-> write the data
		cell.setCellValue("Advanced Selenium");
		FileOutputStream fout=new FileOutputStream("C:\\Users\\sandeep\\Desktop\\Testdata.xlsx");
		book.write(fout);
	}
}