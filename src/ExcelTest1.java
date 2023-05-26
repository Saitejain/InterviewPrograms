
import org.apache.poi.xssf.*;
import org.apache.poi.xssf.usermodel.*;
import java.io.*;

public class ExcelTest1 {
  
  	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File file = new File("F:\\Financial Sample.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook Workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = Workbook.getSheetAt(0);
		int rowCount = sheet.getPhysicalNumberOfRows();
		for(int i=0;i<rowCount;i++) {
			XSSFRow row = sheet.getRow(i);
		
		int cellCount = row.getPhysicalNumberOfCells();
		for(int j=0;j<cellCount;j++) {
			XSSFCell cell = row.getCell(j);
			String cellValue  = getCellValue(cell);
			System.out.println("||"+cellValue);
	
		}
		System.out.println();
		}
		
	}
		public static String getCellValue(XSSFCell cell) {
			switch(cell.getCellType()){
			case NUMERIC:
				return String.valueOf(cell.getNumericCellValue());
				
			case BOOLEAN:
				return String.valueOf(cell.getBooleanCellValue());
			case STRING:
				return cell.getStringCellValue();
				default:
					return cell.getStringCellValue();
				
				
			}
		}


}
