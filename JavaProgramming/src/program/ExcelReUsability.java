package program;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ExcelReUsability {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String test_data = Generic_readExcel.getData("Sheet1", 0, 0);
		System.out.println(test_data);
		
		String test_data1 = Generic_readExcel.getData("Sheet1", 1, 1);
		System.out.println(test_data1);
		
		String data = Generic_readExcel.getData("Sheet1", 2, 5);
		System.out.println(data);
	}

}
