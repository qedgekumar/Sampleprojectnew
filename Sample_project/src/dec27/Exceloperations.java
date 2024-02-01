package dec27;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceloperations {

	public static void main(String[] args) throws Throwable{
		FileInputStream fi = new FileInputStream("C:\\New folder\\sample2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("class");
		XSSFRow row = ws.getRow(0);
		int rc=ws.getLastRowNum();
		int cc=row.getLastCellNum();
		System.out.println("no of rows in class sheet::"+rc+"  "+"no of cells in firstrow::"+cc);
		fi.close();
		wb.close();

	}

}
