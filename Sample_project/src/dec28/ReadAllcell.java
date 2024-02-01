package dec28;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllcell {

	public static void main(String[] args) throws Throwable{
		FileInputStream fi =new FileInputStream("C:\\New folder (2)\\krish.xls");
		Workbook  wb=WorkbookFactory.create(fi);
		Sheet ws=wb.getSheet("sheet1");
		int rc=ws.getLastRowNum();
		for(int i=1;i<=rc;i++) {
			String fname=ws.getRow(i).getCell(0).getStringCellValue();
			String mname=ws.getRow(i).getCell(1).getStringCellValue();
			String lname=ws.getRow(i).getCell(2).getStringCellValue();
			int eid=(int)ws.getRow(i).getCell(3).getNumericCellValue();
			System.out.println(fname+" "+mname+"  "+lname+"  "+eid);
			ws.getRow(i).createCell(4).setCellValue("pass");
			
		}
		
      fi.close();
      FileOutputStream fo=new FileOutputStream("D:/result9.xls");
      wb.write(fo);
      fo.close();
      wb.close();
	}

}
