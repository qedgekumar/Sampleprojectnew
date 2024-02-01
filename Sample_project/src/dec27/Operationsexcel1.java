package dec27;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Operationsexcel1 {

	public static void main(String[] args) throws Throwable{
		FileInputStream fi = new FileInputStream("C:\\New folder\\Sample1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Emp");
		XSSFRow row=ws.getRow(6);
		XSSFCell c1=row.getCell(0);
		XSSFCell c2=row.getCell(1);
		XSSFCell c3=row.getCell(2);
		XSSFCell c4=row.getCell(4);
		String fname=c1.getStringCellValue();
		String mname=c2.getStringCellValue();
		String lname=c3.getStringCellValue();
		int eid=(int)c4.getNumericCellValue();
		System.out.println(fname+"  "+mname+"  "+lname+"  "+eid);
		fi.close();
		wb.close();

	}

}
