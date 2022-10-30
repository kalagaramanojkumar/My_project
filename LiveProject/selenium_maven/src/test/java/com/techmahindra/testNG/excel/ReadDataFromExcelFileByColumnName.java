package com.techmahindra.testNG.excel;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDataFromExcelFileByColumnName {
	public FileInputStream fi;
	public XSSFWorkbook w;
	public XSSFSheet s;
	public XSSFRow row;
	public XSSFCell cell;
	
	
  @Test
  public void f() throws Exception{
	  fi=new FileInputStream("C:\\Users\\612627350\\eclipse-workspace\\LiveProject\\selenium_maven\\test data\\login.xlsx");
	  w=new XSSFWorkbook(fi);
	  s=w.getSheet("Sheet1");
	  row=s.getRow(0);
	  cell=null;
	  int column=-1;
	  for(int i=0;i<row.getLastCellNum();i++) {
		  System.out.println(row.getCell(i).getStringCellValue());
		  if(row.getCell(i).getStringCellValue().equalsIgnoreCase("password")) {
			  column=i;
			  System.out.println("Password Column index is: "+i);
		  }
	  }
      row=s.getRow(3);
      cell=row.getCell(column);
      String pwd=cell.getStringCellValue();
      System.out.println("Value in excel cell is: "+pwd);
  }
}
