package dec27;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Convertcelldata {

	public static void main(String[] args) throws Throwable{
		FileInputStream fi = new FileInputStream("C:\\New folder\\sample4.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws= wb.getSheet("Emp");
		int rc =ws.getLastRowNum();
		for(int i=1;i<=rc;i++) {
			if(wb.getSheet("Emp").getRow(i).getCell(3).getCellType()==CellType.NUMERIC) {
				int celldata=(int)wb.getSheet("Emp").getRow(i).getCell(3).getNumericCellValue();
				//convert celldata integertype into string
				String eid=String.valueOf(celldata);
				System.out.println(eid);
				ws.getRow(i).createCell(4).setCellValue("fail");
			}
				
			
		}
		
       fi.close();
       FileOutputStream fo = new FileOutputStream("D:/evebatch.xlsx");
       wb.write(fo);
       fo.close();
       wb.close();
	}

}
