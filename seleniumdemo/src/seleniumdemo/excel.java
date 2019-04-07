package seleniumdemo;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class excel {
	public static String path;
	public static FileInputStream excelfile;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static void excelpath() throws Exception{
		try{
		 path = "C:\\Users\\Buvaneshwari\\Desktop\\Book1.xlsx";
		  excelfile = new FileInputStream(path);
			 workbook = new XSSFWorkbook(excelfile);
			  sheet = workbook.getSheet("sheet1");
			 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		
	}
	public static String cellvalue(int row,int column) throws Exception{
		String cellsetvalue=null;
		try{
			cellsetvalue=sheet.getRow(row).getCell(column).getStringCellValue();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return cellsetvalue;
	}

}
