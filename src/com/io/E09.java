package com.io;

import java.io.File;
import java.io.FileDescriptor;

public class E09 {

	public static void main(String[] args) {
		File file=new File("D:\\360Downloads\\Software");
		fileDir(file);
	}
	public static void fileDir(File file) {
		File[] listFiles=file.listFiles();
		for(File files : listFiles) {
			if(files.isDirectory()) {
				fileDir(files);
			}
			System.out.println(files);
		}
	}
}
