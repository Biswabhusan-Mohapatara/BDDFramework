package com.products.genericlib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fileutils {
       
	     String filepath="C:\\Users\\Asus-User\\eclipse-workspace\\BDDFramework\\Data\\commondata.properties";
	     String excelpath="C:\\Users\\Asus-User\\eclipse-workspace\\BDDFramework\\Data\\worktable.xlsx";
	     
	     public Properties getproperty() throws Throwable {
	    	 FileInputStream fis=new FileInputStream(filepath);
	    	 Properties pObj=new Properties();
	    	 pObj.load(fis);
			return pObj;
	   	     }
	     public String getExcelData(String sheetname,int rownum,int celnum) throws Throwable {
	    	 FileInputStream fis=new FileInputStream(excelpath);
	    	 Workbook wb=WorkbookFactory.create(fis);
	    	 Sheet sh=wb.getSheet(sheetname);
	    	 String data=sh.getRow(rownum).getCell(celnum).getStringCellValue();
	    	 wb.close();
			return data;
	     }
	     
}
