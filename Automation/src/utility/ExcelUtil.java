package utility;

import java.io.*;

import org.apache.poi.xssf.usermodel.*;

public class ExcelUtil {
	private static XSSFWorkbook ExcelWbook;
	private static XSSFSheet ExcelWsheet;
	private static XSSFRow Row;
	private static XSSFCell Cell;
	public String Path = "C:\\Users\\Ankur\\Desktop\\TestData.xlsx";
	public static void setExcel(String Path) throws Exception{
		try{
			FileInputStream fis = new FileInputStream(Path);
			ExcelWbook = new XSSFWorkbook(fis);
			ExcelWsheet = ExcelWbook.getSheetAt(0);	
		}catch(Exception e){
			throw(e);
		}
	}
	public static String getCelldata(int rownum,int colnum) throws Exception{
		try{
			Cell = ExcelWsheet.getRow(rownum).getCell(colnum);
			String CellData = Cell.getStringCellValue();
			return CellData;
		}catch(Exception e)
		{
			throw (e);
		}
	}
public static void setCellData(String Result, int rownum, int colnum) throws Exception{
	try{
		Row = ExcelWsheet.getRow(rownum);
		Cell = Row.getCell(colnum);
				if(Cell==null){
					Cell = Row.createCell(colnum);
					Cell.setCellValue(Result);}
				else
				{
					Cell.setCellValue(Result);
					}
		FileOutputStream fout = new FileOutputStream("C:\\Users\\Ankur\\Desktop\\TestData.xlsx");
		ExcelWbook.write(fout);
		fout.close();
				}catch(Exception e){
					throw (e);}
	}
}