package Day2;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	public static String path;
	public static FileInputStream excelfile;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;

	public static void excel() throws Exception{
		try{
		 path = "C:\\Users\\Buvaneshwari\\Desktop\\Book2.xlsx";
		   excelfile = new FileInputStream(path);
		    workbook = new XSSFWorkbook(excelfile);
		     sheet = workbook.getSheet("sheet1");
		}
		
		catch(Exception e){
			
		e.printStackTrace();
		}
		
	}
	
	public static String Cellvalue(int row,int column) throws Exception {
		String cellset=null;
		try
		{
			
			cellset=sheet.getRow(row).getCell(column).getStringCellValue();
			
	
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return cellset;
	}

}
