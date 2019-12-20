package com.io;

import java.util.List;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class E16 {

	public static void main(String[] args) throws IOException {
		Path directoryPath=Paths.get("d:/test/sample");
		Files.createDirectories(directoryPath);
		System.out.println("目录创建成功");
		Path filePath=Paths.get("D:/test/smple/test.txt");
		Files.createFile(filePath);
		List<String>list=new ArrayList<>();
		list.add("这是一个测试文件");
		Files.write(filePath, list, StandardOpenOption.APPEND);
		List<String>lines=Files.readAllLines(filePath);
		System.out.println("文件的大小为:"+Files.size(filePath));
		System.out.println("文件中的内容为:"+lines);

	}

}
