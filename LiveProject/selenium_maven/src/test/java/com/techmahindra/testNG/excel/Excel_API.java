package com.techmahindra.testNG.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_API {

	public FileInputStream fi= null;
	public FileOutputStream fo= null;
    public XSSFWorkbook w=null;
    public XSSFSheet s=null;
    public XSSFRow row=null;
    public XSSFCell cell=null;
    String filepath;
    
    public Excel_API(String file) throws Exception{
    this.filepath=file;
    fi=new FileInputStream(filepath);
    w=new XSSFWorkbook(fi);
    }
    
    //Reading Cell Data From Excel File By Using Column Index
    public String getCellData(String sheetName, int colNum, int rowNum) {
    	try {
			s=w.getSheet(sheetName);
			row=s.getRow(rowNum);
			cell=row.getCell(colNum);
			
			if(cell.getCellTypeEnum()==CellType.STRING) {
				return cell.getStringCellValue();
			}else if(cell.getCellTypeEnum()==CellType.NUMERIC || cell.getCellTypeEnum()==CellType.FORMULA) {
				String cellValue=String.valueOf(cell.getNumericCellValue());
				return cellValue;
			}else if(cell.getCellTypeEnum()==CellType.BLANK) {
				return "";
			}else {
				return String.valueOf(cell.getBooleanCellValue());
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "No Matching Value";
		} 
    }
    
    //Reading Cell Data From Excel By Using Column Name
    public String getCellData(String sheetName,String colName, int rowNum) {
    	try {
			int colNum=-1;
			s=w.getSheet(sheetName);
			row=s.getRow(0);
			for(int i=0;i<row.getLastCellNum();i++) {
				if(row.getCell(i).getStringCellValue().equalsIgnoreCase(colName)) {
					colNum=i;
				}
			}
			row=s.getRow(rowNum);
			cell=row.getCell(colNum);
			if(cell.getCellTypeEnum()==CellType.STRING) {
				return cell.getStringCellValue();
			}else if(cell.getCellTypeEnum()==CellType.NUMERIC || cell.getCellTypeEnum()==CellType.FORMULA) {
				String cellValue=String.valueOf(cell.getNumericCellValue());
				return cellValue;
			}else if(cell.getCellTypeEnum()==CellType.BLANK) {
				return "";
			}else {
				return String.valueOf(cell.getBooleanCellValue());
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "No Matching Value";
		}
    }
    
    //Writing Cell Data To Excel By Column Index
    public boolean setCellData(String sheetName, int colNum, int rowNum, String value) throws Exception{
    	 try {
			s=w.getSheet(sheetName);
			 row=s.getRow(rowNum);
			 if(row==null) 
				 row=s.createRow(rowNum);
			 cell=row.getCell(colNum);
			 if(cell==null)
			 cell=row.createCell(colNum);
			 cell.setCellValue(value);
			 fo=new FileOutputStream(filepath);
			 w.write(fo);
			 fo.close();
		} catch (Exception e) {
		e.printStackTrace();
		return false;
		}
    	 return true;
    }
    //Writing Cell Data To Excel By Column Name
    public boolean setCellData(String sheetName, String colName, int rowNum, String value) {
    	try {
			int colNum=-1;
			s=w.getSheet(sheetName);
			row=s.getRow(0);
			for(int i=0;i<row.getLastCellNum();i++) {
				if(row.getCell(i).getStringCellValue().equalsIgnoreCase(colName)) {
					colNum=i;
				}
			}
			 row=s.getRow(rowNum);
			 if(row==null) 
				 row=s.createRow(rowNum);
			 cell=row.getCell(colNum);
			 if(cell==null)
			 cell=row.createCell(colNum);
			 cell.setCellValue(value);
			 fo=new FileOutputStream(filepath);
			 w.write(fo);
			 fo.close();
		} catch (Exception e) {
						e.printStackTrace();
						return false;
			
		}
    	return true;
    }
    //Identify No of Rows And No of Colums in Excel File
    public int getRows(String sheetName) {
    	s=w.getSheet(sheetName);
    	int rowCount= s.getLastRowNum()+1;
    	return rowCount;
    }
    public int getColumns(String sheetName) {
    	s=w.getSheet(sheetName);
    	row=s.getRow(0);
    	int columnCount=row.getLastCellNum();
    	return columnCount;
    }
}

























































