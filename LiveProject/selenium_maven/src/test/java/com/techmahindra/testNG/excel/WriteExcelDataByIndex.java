package com.techmahindra.testNG.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcelDataByIndex {
	
	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook w;
	public XSSFSheet s;
	public XSSFRow row;
	public XSSFCell cell;
  @Test
  public void f() throws Exception{
	  fi=new FileInputStream("C:\\Users\\612627350\\eclipse-workspace\\LiveProject\\selenium_maven\\test data\\login.xlsx");
	  w=new XSSFWorkbook(fi);
	  s=w.getSheet("Sheet1");
	  row=null;
	  cell=null;
	  row=s.getRow(3);
	  if(row==null) 
		  row=s.createRow(3);
	  cell=row.getCell(2);
	  if(cell==null)
		  cell=row.createCell(2);
	  cell.setCellValue("PASSED");
	  fo=new FileOutputStream("C:\\Users\\612627350\\eclipse-workspace\\LiveProject\\selenium_maven\\test data\\login.xlsx");
	  w.write(fo);
	  fo.close();
  }
}
