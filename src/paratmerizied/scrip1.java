package paratmerizied;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class scrip1 {
	public static void main(String[] args) throws Throwable {
		FileInputStream file=new FileInputStream("C:\\Users\\shree\\Desktop\\KOMAL\\A1.xlsx");
	//ope url 
	 double data = WorkbookFactory.create(file).getSheet("A").getRow(0).getCell(0).getNumericCellValue();
	 System.out.println(data);
	
	}
}
