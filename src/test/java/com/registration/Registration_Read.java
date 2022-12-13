package com.registration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Registration_Read {
	
	public static void readAllData() throws IOException {
	
		System.out.println("*******************All Data********************");
		
		File f = new File("C:\\Users\\Surendhar\\eclipse-workspace\\Maven_Project\\Registration Details.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		try (Workbook w = new XSSFWorkbook(fis)) {
			Sheet sheetAt = w.getSheetAt(0);
			
			int numberOfRows = sheetAt.getPhysicalNumberOfRows();
			
			for (int i = 0; i < numberOfRows; i++) {
				
				Row row = sheetAt.getRow(i);
				
				int numberOfCells = row.getPhysicalNumberOfCells();
				
				for (int j = 0; j < numberOfCells; j++) {
					
					Cell cell = row.getCell(j);
					
					CellType cellType = cell.getCellType();
					
					if (cellType.equals(CellType.STRING)) {
						String stringCellValue = cell.getStringCellValue();
						System.out.println(stringCellValue);		
						
					}
					
					else if (cellType.equals(CellType.NUMERIC)) {
						double numericCellValue = cell.getNumericCellValue();
						int num = (int) numericCellValue;
						System.out.println(num);
					}
				}
			}
		}
	}
	
	
	public static void particulardata () throws IOException {
		
		System.out.println("*****************Particular Data*******************");
		
		File f = new File ("C:\\Users\\Surendhar\\eclipse-workspace\\Maven_Project\\Registration Details.xlsx");
		
	    FileInputStream fis = new FileInputStream(f);
	    
		try (Workbook w = new XSSFWorkbook(fis)) {
			Sheet sheetAt = w.getSheetAt(0);
			
			Row row = sheetAt.getRow(1);
			
			Cell cell = row.getCell(1);
			
			CellType cellType = cell.getCellType();
			
			if (cellType.equals(CellType.STRING)) {
				
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			}
			
			else if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int num = (int) numericCellValue;
				System.out.println(num);
				
			}
		}
		
	}
	
	
	public static void row() throws IOException {
    	
    	System.out.println("****************Particular Row*****************");
    	
    	File f = new File ("C:\\Users\\Surendhar\\eclipse-workspace\\Maven_Project\\Registration Details.xlsx");
    	
        FileInputStream fis = new FileInputStream(f);
        
        try (Workbook w = new XSSFWorkbook(fis)) {
			Sheet sheetAt = w.getSheetAt(0);
			
			Row row = sheetAt.getRow(2);
			
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < physicalNumberOfCells; j++) {
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				
				if(cellType.equals(CellType.STRING)) {	
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);

				}
				
				else if (cellType.equals(CellType.NUMERIC)) {	
					double numericCellValue = cell.getNumericCellValue();
					int num=(int) numericCellValue;
					System.out.println(num);
				}
			}
		}
    	
    }
	    public static void column() throws IOException {
	    	
	    	
	    	System.out.println("****************Particular Column*****************");
		
		File f = new File("C:\\Users\\Surendhar\\eclipse-workspace\\Maven_Project\\Registration Details.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		try (Workbook w = new XSSFWorkbook(fis)) {
			Sheet sheetAt = w.getSheetAt(0);
			
			int NumberOfRows = sheetAt.getPhysicalNumberOfRows();
			
				for(int i = 0; i<NumberOfRows; i++) {
			      Row row = sheetAt.getRow(i);
				
				Cell cell = row.getCell(2);
				
				CellType cellType = cell.getCellType();
				
				if(cellType.equals(CellType.STRING)) {	
					String Value = cell.getStringCellValue();
					System.out.println(Value);
				}
				
				else if(cellType.equals(CellType.NUMERIC)) {
					double Value = cell.getNumericCellValue();
					int num=(int) Value;
					System.out.println(num);
					
				}
   
			}
		}
	  
	 }

	public static void main(String[] args) throws IOException {
		
		readAllData();
		particulardata();
		row();
		column();

	}

}
