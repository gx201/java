package com.io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class E15 {

	public static void main(String[] args) {
		Path path=Paths.get("D:\\test\\文件夹\\test.txt");
		System.out.println("path的根路径:"+path.getRoot());
		System.out.println("path的父路径:"+path.getParent());
		System.out.println("path中的路径名称数:"+path.getNameCount());
		for(int i=0;i<path.getNameCount();i++) {
			Path name=path.getName(i);
			System.out.println("索引为"+i+"的路径的名称为:"+name);
		}
		System.out.println("path的URI路径为："+path.toUri());
		System.out.println("path的绝对路径:"+path.toAbsolutePath());
	}
	

}
