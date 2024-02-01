package dec29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Interface {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi=new FileInputStream("D:\\krish5.xlsx");
		Workbook wb= WorkbookFactory.create(fi);
		Sheet ws=wb.getSheet("sheet1");
		int rc=ws.getLastRowNum();
		System.out.println(rc);
		for(int i=1;i<=rc;i++) {
			ws.getRow(i).createCell(4).setCellValue("pass");
			CellStyle style=wb.createCellStyle();
			Font font=wb.createFont();
		    font.setColor(IndexedColors.GREEN.getIndex());
		    font.setBold(true);
		    style.setFont(font);
		    ws.getRow(i).getCell(4).setCellStyle(style);
		}
        fi.close();
        FileOutputStream fo=new FileOutputStream("D:/res.xlsx");
        wb.write(fo);
        fo.close();
        wb.close();
	}

}
