package com.Maven_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Create {
	
	public static void writedata() throws IOException {
		
		File f = new File("C:\\Users\\Surendhar\\eclipse-workspace\\Maven_Project\\Registration Details.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet createSheet = w.createSheet("Sheet2_Write_Data");
		
		Row createRow = createSheet.createRow(0);
		
		Cell createCell = createRow.createCell(0);
		
		createCell.setCellValue("Balu");
		
		w.getSheet("Sheet2_Write_Data").getRow(0).createCell(1).setCellValue("Suresh");
		
		w.getSheet("Sheet2_Write_Data").createRow(1).createCell(0).setCellValue("Karthi");
		
		w.getSheet("Sheet2_Write_Data").getRow(1).createCell(1).setCellValue("Ajay");
		
		w.getSheet("Sheet2_Write_Data").createRow(2).createCell(0).setCellValue("Venkatesh");
		
		w.getSheet("Sheet2_Write_Data").getRow(2).createCell(1).setCellValue("Prakash");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		w.write(fos);
		
		w.close();
	}

	public static void main(String[] args) throws IOException {

		writedata();
		
	    }
	}


