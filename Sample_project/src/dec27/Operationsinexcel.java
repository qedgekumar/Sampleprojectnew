package dec27;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Operationsinexcel {

	public static void main(String[] args) throws Throwable{
		FileInputStream  fi=new FileInputStream("C:\\New folder\\Sample1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Emp");
		XSSFRow row=ws.getRow(0);
		int rc=ws.getLastRowNum();
		int cc=row.getLastCellNum();
		System.out.println("No of rows in Emp sheet::"+rc+"  "+"No of cells in first row::"+cc);
		fi.close();
		wb.close();
		

	}

}
