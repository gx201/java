package com.io;

import java.io.File;
import java.util.Arrays;

public class E08 {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\Administrator\\Desktop\\18软件1班作业\\郭旭");
		if(file.isDirectory()) {
			String[] fileNames=file.list((dir,name)->name.endsWith("txt"));
			Arrays.stream(fileNames).forEach(f->System.out.println(f));
		}

	}

}
