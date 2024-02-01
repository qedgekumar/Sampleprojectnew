package jan1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel123 {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi=new  FileInputStream("C:\\New folder (2)\\sample3.xlsx");
         Workbook wb= WorkbookFactory.create(fi);
         Sheet ws=wb.getSheet("sheet1");
         
         int cc=(int) ws.getRow(1).getLastCellNum();
         System.out.println(  "No of columns:"+cc);
         fi.close();
         wb.close();
	}

}
