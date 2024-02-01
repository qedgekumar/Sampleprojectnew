package jan1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel10 {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi =new FileInputStream("C:\\New folder (2)\\sample3.xlsx");
        XSSFWorkbook wb=new XSSFWorkbook(fi);
        XSSFSheet ws=wb.getSheet("sheet1");
        int rc=ws.getLastRowNum();
        System.out.println("No of rows are::"+rc);
        for(int i=1;i<=rc;i++) {
        	ws.getRow(i).createCell(4).setCellValue("Blocked");
        	XSSFCellStyle style=wb.createCellStyle();
        	XSSFFont font=wb.createFont();
        	font.setColor(IndexedColors.GREEN.getIndex());
        	font.setBold(true);
        	style.setFont(font);
        	ws.getRow(i).getCell(4).setCellStyle(style);
        	
        	
        	
        }
        fi.close();
        FileOutputStream fo=new FileOutputStream("D:/red1.xlsx");
        wb.write(fo);
        fo.close();
        wb.close();
        
  
	}

}
