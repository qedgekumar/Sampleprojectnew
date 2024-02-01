package jan1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel4 {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi=new FileInputStream("C:\\New folder (2)\\sample3.xlsx");
        XSSFWorkbook wb=new XSSFWorkbook(fi);
        XSSFSheet ws=wb.getSheet("sheet1");
        int rc=ws.getLastRowNum();
        System.out.println("No of rows are::"+rc);
        String fname=ws.getRow(8).getCell(0).getStringCellValue();
        String mname=ws.getRow(2).getCell(1).getStringCellValue();
        String lname=ws.getRow(3).getCell(2).getStringCellValue();
        int eid=(int) ws.getRow(4).getCell(3).getNumericCellValue();
        System.out.println(fname+" "+mname+" "+lname+" "+eid);
        fi.close();
        wb.close();
	}

}
