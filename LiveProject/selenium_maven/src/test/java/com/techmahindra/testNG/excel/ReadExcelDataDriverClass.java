package com.techmahindra.testNG.excel;

import org.testng.annotations.Test;

public class ReadExcelDataDriverClass {
  @Test
  public void f() throws Exception {
     Excel_API e=new Excel_API("C:\\Users\\612627350\\eclipse-workspace\\LiveProject\\selenium_maven\\test data\\login.xlsx");
     System.out.println("----Read Data From Excel File By Using Col Num----");
     System.out.println(e.getCellData("Sheet1", 0, 1));
     System.out.println(e.getCellData("Sheet1", 1, 1));
     System.out.println(e.getCellData("Sheet1", 2, 1));
     System.out.println("----Read Data From Excel File By Using Col Name----");
     System.out.println(e.getCellData("Sheet1", "Username", 2));
     System.out.println(e.getCellData("Sheet1", "Password", 2));
     System.out.println("----Set Data To Excel File By Using Col Index----");
     System.out.println(e.setCellData("Sheet1",2,6, "Passed"));
     System.out.println("----Set Data To Excel By Column Name----");
     System.out.println(e.setCellData("Sheet1", "Results", 5, "Skipped"));
     System.out.println("----To Get No of Row in Excel Sheet----");
     System.out.println(e.getRows("Sheet1"));
     System.out.println("----To Get No of Coloums in Excel Sheet----");
     System.out.println(e.getColumns("Sheet1"));
  }
}
