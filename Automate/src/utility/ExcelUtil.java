package utility;

import org.testng.annotations.Test;

import java.io.*;

import org.apache.poi.xssf.usermodel.*;

public class ExcelUtil {
	private static XSSFWorkbook ExcelWbook;
	private static XSSFSheet ExcelWsheet;
	private static XSSFCell Cell;
	@Test(dataProvider = "Auth")
	public  static Object[][] getTabArray(String path, String SheetName) throws Exception{
		String [][] gettab = null;
		
		try{
			FileInputStream fis = new FileInputStream(path);
			ExcelWbook = new XSSFWorkbook (fis);
			ExcelWsheet = ExcelWbook.getSheet(SheetName);
			//int rowcount = ExcelWsheet.getLastRowNum();
			int rowcount =1;
			System.out.println(rowcount);
			int colcount = 1;
			gettab = new String [rowcount][colcount];	
			int ci=0;
			int cj=0;
			for(int i=1;i<=rowcount;i++,ci++){
				for(int j=1;j<=colcount;j++,cj++){
					gettab[ci][cj] = getCellData(i,j);
				}}
		}catch(Exception e){
		throw (e);}
		return (gettab);
		}
				
  public static String getCellData(int rownum, int colnum) throws Exception{
	   try{
		  Cell = ExcelWsheet.getRow(rownum).getCell(colnum);
		  String cellData = Cell.getStringCellValue();
		  return (cellData);
	  }catch(Exception e){
		  throw (e);}
	  
  }
  public static String getTestName(String sTestName) throws Exception{
	  String name = sTestName;
	  try{	  
	  int posi = name.indexOf("@");
	  name = name.substring(0,posi);
	  posi = name.lastIndexOf(".");
	  name = name.substring(posi + 1);
	  return name;
  }catch(Exception e){
	  throw (e);}
  }
  
  public static int getRowContains(String sTestName, int ncol ) throws Exception{
	  int i;
	  try{
	  int rowcount = ExcelUtil.getRowUsed();
	  for(i=0;i<rowcount;i++){
		  if(ExcelUtil.getCellData(i,ncol).equalsIgnoreCase(sTestName)){
			break;
		  }
	  }
	  return i;
  }catch(Exception e){
	  throw (e);
  }
  }
	public static int getRowUsed() throws Exception{
		try{
			int rowcount = ExcelWsheet.getLastRowNum();
			return rowcount;
		}catch(Exception e){
			throw (e);
		}
		}
}