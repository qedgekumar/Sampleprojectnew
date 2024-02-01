package dec29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Interface1 {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("C:\\New folder (2)\\sample3.xlsx");
        XSSFWorkbook wb=new XSSFWorkbook(fi);
        XSSFSheet ws=wb.getSheet("sheet1");
        XSSFRow row=ws.getRow(0);
        int rc=ws.getLastRowNum();
        int cc=row.getLastCellNum();
        System.out.println("No of rows are in first row ::"+rc+"  "+"no of columns in firstrow::"+cc);
        fi.close();
        wb.close();
       
	}

}
