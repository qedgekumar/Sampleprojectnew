package jan1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel8 {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi=new FileInputStream("C:\\New folder (2)\\sample3.xlsx");
        XSSFWorkbook wb=new XSSFWorkbook(fi);
        XSSFSheet ws=wb.getSheet("sheet1");
        int rc=ws.getLastRowNum();
        System.out.println("No of rows are::"+rc);
        for(int i=1;i<=rc;i++)
        {
        
			if (wb.getSheet("sheet1").getRow(i).getCell(3).getCellType()==CellType.NUMERIC) {
				int celldata=(int) wb.getSheet("sheet1").getRow(i).getCell(3).getNumericCellValue();
				String eid=String.valueOf(celldata);
				System.out.println(eid);
				ws.getRow(i).createCell(4).setCellValue("fail");
				
				
			}	
			
        }
        fi.close();
        FileOutputStream fo=new FileOutputStream("D:/pkres.xlsx");
        wb.write(fo);
        fo.close();
        wb.close();
        
        
	}

}
