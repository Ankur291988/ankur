package selpac;

import java.io.*;

import org.apache.poi.xssf.usermodel.*;

public class ExcelUtil {
	public static String getExcel(String Path, int rownum,int colnum) throws Exception{
		try{
		File src = new File(Path);
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		String str = (sh.getRow(rownum).getCell(colnum).getStringCellValue());
		return str;	
	}catch(Exception e){
		throw(e);}
	}
	public static void setExcel(String Result,int rownum,int colnum) throws Exception{
		try{
			File src = new File("C:\\Users\\Ankur\\Desktop\\TestData.xlsx");
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheetAt(0);
			sh.getRow(rownum).createCell(colnum).setCellValue(Result);
			FileOutputStream fout = new FileOutputStream(src);
			wb.write(fout);
			fout.close();
			wb.close();
		}catch(Exception e){
			throw(e);
		}
	}
		

	}


