package dec27;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata1 {

	public static void main(String[] args) throws Throwable{
		FileInputStream fi= new FileInputStream("C:\\New folder\\sample4.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Emp");
		int rc =ws.getLastRowNum();
		System.out.println("No of rows are::"+rc);
		String fname=ws.getRow(8).getCell(2).getStringCellValue();
		String mname=ws.getRow(3).getCell(0).getStringCellValue();
	    String lname=ws.getRow(6).getCell(1).getStringCellValue();
	    int eid=(int)ws.getRow(7).getCell(3).getNumericCellValue();
	    System.out.println(fname+" "+mname+"  "+lname+"  "+eid);
	    fi.close();
	    wb.close();
		

	}

}
