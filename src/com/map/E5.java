package com.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class E5 {

	public static void main(String[] args) throws IOException {
		Properties sxj=new Properties();
		sxj.load(new FileInputStream("E:\\java基础\\9.6\\java9.17\\src\\com\\map\\test.properties"));
		sxj.forEach((key,value)->System.out.println(key+"="+value));
		FileOutputStream out=new FileOutputStream("E:\\java基础\\9.6\\java9.17\\src\\com\\map\\test.properties");
		sxj.setProperty("charset","UTF-8");
		sxj.store(out,"新增 charset编码");
	}

}
