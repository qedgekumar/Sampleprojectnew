package jan1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi=new FileInputStream("C:\\New folder (2)\\sample3.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet ws = wb.getSheet("Sheet1");
		String user = ws.getRow(0).getCell(0).getStringCellValue();
		int cc = ws.getRow(1).getLastCellNum();
		
		
		System.out.println("No of rows in EMP sheet::"+cc+"  "+"No of cells in first row"+cc);
       fi.close();
       wb.close();
	}

}
