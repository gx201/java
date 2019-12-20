package com.jdbc;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Shili_input {

	public static void main(String[] args) throws Exception {
		FileInputStream fin=new FileInputStream("18rj1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		for(int i=1; i<=rows; i++) {
			XSSFRow row=sheet.getRow(i);
			XSSFCell cell=row.getCell(3);
			String xuehao=cell.getStringCellValue();
			
			XSSFCell cell16=row.getCell(15);
			String z_shili=cell16.getStringCellValue();
			XSSFCell cell17=row.getCell(16);
			String y_shili=cell17.getStringCellValue();
			System.out.println(xuehao);
			System.out.println(z_shili);
			System.out.println(y_shili);
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?characterEncoding=UTF-8","root","123456");
			Statement yuju=conn.createStatement();
			String sql="UPDATE 18rj1 SET `左眼裸眼视力`='"+z_shili+"' WHERE '学号'='"+xuehao+"'";
			String sql1="UPDATE 18rj1 SET `右眼裸眼视力`='"+z_shili+"' WHERE '学号'='"+xuehao+"'";
			yuju.execute(sql);
			yuju.execute(sql1);
		}
	}

}
