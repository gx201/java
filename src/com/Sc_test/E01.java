package com.Sc_test;

import java.util.List;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class E01 {

	public static void main(String[] args) throws IOException {
		HSSFWorkbook wb=new HSSFWorkbook();
		HSSFSheet sheet=wb.createSheet("测试模板");
		//创建第一行
		sheet.createRow(0);
		
		HSSFRow row0=sheet.createRow(0);
		HSSFCell cell0=row0.createCell(0);
		cell0.setCellValue("年级");
		row0.createCell(1).setCellValue("班级编号");
		row0.createCell(2).setCellValue("班级名称");
		row0.createCell(3).setCellValue("项目名称");
		row0.createCell(4).setCellValue("测试老师");
		row0.createCell(5).setCellValue("测试时间");
		row0.createCell(6).setCellValue("测试地点");
		row0.createCell(7).setCellValue("测试器材");
		row0.createCell(8).setCellValue("测试方式(手工/仪器)");
		Path wj=Paths.get("D:\\班级信息.txt");
		List<String> lines=Files.readAllLines(wj);
		
		for	(int j=0;j<lines.size();j++) {
			String line=lines.get(j);
			String[] zfcsz=line.split("\t");
			for(int i = j*10+1;i<j*10+11;i++) {
				HSSFRow Rowi=sheet.createRow(i);
				Rowi.createCell(0).setCellValue("42");
				Rowi.createCell(1).setCellValue(zfcsz[0]);
				Rowi.createCell(2).setCellValue(zfcsz[1]);
				if(i%10==1) {
					Rowi.createCell(3).setCellValue("身高");
					Rowi.createCell(4).setCellValue("高家明");
					Rowi.createCell(5).setCellValue("2019/10/29");
					Rowi.createCell(6).setCellValue("学院体育馆");
					Rowi.createCell(8).setCellValue("2");
				}
				if(i%10==2) {
					Rowi.createCell(3).setCellValue("体重");
					Rowi.createCell(4).setCellValue("李国珍");
					Rowi.createCell(5).setCellValue("2019/10/29");
					Rowi.createCell(6).setCellValue("学院体育馆");
					Rowi.createCell(8).setCellValue("2");
				}
				if(i%10==3) {
					Rowi.createCell(3).setCellValue("肺活量");
					Rowi.createCell(4).setCellValue("李雪纯之/刘念念");
					Rowi.createCell(5).setCellValue("2019/10/29");
					Rowi.createCell(6).setCellValue("学院体育馆");
					Rowi.createCell(8).setCellValue("2");
				}
				if(i%10==4) {
					Rowi.createCell(3).setCellValue("50米跑");
					Rowi.createCell(4).setCellValue("/赵玉巧李红梅");
					Rowi.createCell(5).setCellValue("2019/11/9");
					Rowi.createCell(6).setCellValue("学院田径场");
					Rowi.createCell(8).setCellValue("1");
				}
				if(i%10==5) {
					Rowi.createCell(3).setCellValue("立定跳远");
					Rowi.createCell(4).setCellValue("/赵武科肖越");
					Rowi.createCell(5).setCellValue("2019/10/29");
					Rowi.createCell(6).setCellValue("学院体育馆");
					Rowi.createCell(8).setCellValue("2");
				}
				if(i%10==6) {
					Rowi.createCell(3).setCellValue("坐位体前屈");
					Rowi.createCell(4).setCellValue("卢渊博/周娟");
					Rowi.createCell(5).setCellValue("2019/10/29");
					Rowi.createCell(6).setCellValue("学院体育场");
					Rowi.createCell(8).setCellValue("1");
				}
				if(i%10==7) {
					Rowi.createCell(3).setCellValue("1000米跑");
					Rowi.createCell(4).setCellValue("王显涛/周天翔");
					Rowi.createCell(5).setCellValue("2019/11/9");
					Rowi.createCell(6).setCellValue("学院田径场");
					Rowi.createCell(8).setCellValue("2");
				}
				if(i%10==8) {
					Rowi.createCell(3).setCellValue("引体向上");
					Rowi.createCell(4).setCellValue("陈永军/梅玉洁");
					Rowi.createCell(5).setCellValue("2019/10/29");
					Rowi.createCell(6).setCellValue("学院体育馆");
					Rowi.createCell(8).setCellValue("2");
				}
				if(i%10==9) {
					Rowi.createCell(3).setCellValue("800米跑");
					Rowi.createCell(4).setCellValue("葛新");
					Rowi.createCell(5).setCellValue("2019/11/9");
					Rowi.createCell(6).setCellValue("学院田径场");
					Rowi.createCell(8).setCellValue("1");
				}
				if(i%10==0) {
					Rowi.createCell(3).setCellValue("一分钟仰卧起坐");
					Rowi.createCell(4).setCellValue("毛胜宇/杨钰莹");
					Rowi.createCell(5).setCellValue("2019/10/29");
					Rowi.createCell(6).setCellValue("学院体育馆");
					Rowi.createCell(8).setCellValue("2");
				}

			}
		
		
	}
		FileOutputStream fout=new FileOutputStream("d:\\测试模板.xls");
		wb.write(fout);
		fout.close();
	}

}
