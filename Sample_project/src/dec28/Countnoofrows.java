package dec28;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Countnoofrows {

	public static void main(String[] args) throws Throwable{
		FileInputStream fi = new FileInputStream("C:\\New folder (2)\\Sample.xlsx");
        XSSFWorkbook wb =new XSSFWorkbook(fi);
        XSSFSheet ws=wb.getSheet("sheet1");
        XSSFRow row=ws.getRow(0);
        int rc=ws.getLastRowNum();
        int cc=row.getLastCellNum();
        System.out.println("No of rows are::"+rc+" "+"No of columns are::"+cc);
        fi.close();
        wb.close();
	}

}
