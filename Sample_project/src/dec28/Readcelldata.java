package dec28;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readcelldata {

	public static void main(String[] args) throws Throwable{
		FileInputStream fi = new FileInputStream("C:\\New folder (2)\\Sample.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("sheet1");
		int rc=ws.getLastRowNum();
		
			String fname=ws.getRow(4).getCell(0).getStringCellValue();
			String mname=ws.getRow(6).getCell(1).getStringCellValue();
			String lname=ws.getRow(5).getCell(2).getStringCellValue();
			int eid=(int)ws.getRow(8).getCell(3).getNumericCellValue();
			System.out.println(fname+"  "+mname+"  "+lname+"  "+eid);
			fi.close();
			wb.close();
			
		}

	}


