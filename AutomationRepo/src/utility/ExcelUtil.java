package utility;

import java.io.*;

import org.apache.poi.xssf.usermodel.*;

public class ExcelUtil {
private static XSSFWorkbook ExcelWbook;
private static XSSFSheet ExcelSheet;
private  static XSSFRow Row;
private static XSSFCell Cell;

public static Object[][] gettabArray(String path,String Sheetname) throws Exception{
	String tabArray[][] = null;
	try{
		FileInputStream fis = new FileInputStream(path);
		ExcelWbook = new XSSFWorkbook (fis);
		ExcelSheet = ExcelWbook.getSheet(Sheetname);
		int rowcount = ExcelSheet.getLastRowNum();
		int colnum = ExcelSheet.getLastRowNum();
		tabArray = new String[rowcount][colnum];
		Cell = ExcelSheet.getRow(rowcount).getCell(colnum);
		int ci,cj;
		ci = 0;
		cj = 0;
		for(int i = 1;i<=rowcount;i++,ci++){
			for(int j = 1;j<=colnum;j++,cj++){
				tabArray[ci][cj] =FrameworkDD.utility.ExcelUtil.getCellData(i,j);				
			}
		}
	}catch(Exception e){
		throw (e);}
	}

}