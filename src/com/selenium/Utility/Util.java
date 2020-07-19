package com.selenium.Utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.selenium.prc.UsrInfo;

public class Util {
	
	public static UsrInfo readInfoFromExcel(String fn) throws Exception{
		FileInputStream fr=new FileInputStream(fn);
		XSSFWorkbook workbook=new XSSFWorkbook(fr);
		XSSFSheet sh1=workbook.getSheetAt(0);
		
		Row curRow=sh1.getRow(1);
		
		UsrInfo curUsr=new UsrInfo();
		DataFormatter formatter=new DataFormatter();
//	int infoCnt=curRow.getPhysicalNumberOfCells();
		curUsr.setFrstName(curRow.getCell(0).getStringCellValue());//firstname
		curUsr.setLstName(curRow.getCell(1).getStringCellValue());  //lastname
		curUsr.setEmail(curRow.getCell(2).getStringCellValue());//email
		curUsr.setGender(curRow.getCell(3).getStringCellValue());//gender
//		curUsr.setMobile(curRow.getCell(4).getStringCellValue());//mobile
		curUsr.setMobile(formatter.formatCellValue(curRow.getCell(4)));
//		curUsr.setDOB(curRow.getCell(5).getStringCellValue());//DOB
		
		String birthday=formatter.formatCellValue(curRow.getCell(5));
		curUsr.setDOB(birthday);
		curUsr.setSubject(curRow.getCell(6).getStringCellValue());
		curUsr.setHobbies(curRow.getCell(7).getStringCellValue());
		curUsr.setPicLoc(curRow.getCell(8).getStringCellValue());
		curUsr.setAddr(curRow.getCell(9).getStringCellValue());
		curUsr.setState(curRow.getCell(10).getStringCellValue());
		curUsr.setCity(curRow.getCell(11).getStringCellValue());
	
		return curUsr;
		
		
	}
}
