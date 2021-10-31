package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public String[][] readData(String fileName) throws IOException {
		//step1: setup the path for Workbook .xlsx
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		//step2: get into the worksheet
		XSSFSheet ws = wb.getSheet("Sheet1");
		//to get the row count
		int rowCount = ws.getLastRowNum();
		//to get the cell count
		int cellCount = ws.getRow(0).getLastCellNum(); //4
	
		//Declare 2D array 
		String[][] data = new String[rowCount][cellCount]; // 2,4
		
		//row
		for (int i = 1; i <= rowCount; i++) {
			//each cell
			for (int j = 0; j < cellCount; j++) {
				
				String text = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(text);
				//first data address is 0,0 -> to get this i-1 , j
				data[i-1][j] = text;
			}
		}
				
		//last step
		wb.close();
		return data;
		
		//to get the count from 1st row
		//int countFromFirstRow = ws.getPhysicalNumberOfRows();
		//System.out.println(countFromFirstRow);
	

	}

}
