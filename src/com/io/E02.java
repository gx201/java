package com.io;

import java.io.*;
public class E02 {

	public static void main(String[] args) throws IOException {
		FileInputStream in=new FileInputStream("D://1.jpg");
		FileOutputStream out=new FileOutputStream("D://2.jpg");
		int len=0;
		long beginTime=System.currentTimeMillis();
		while ((len=in.read())!=-1) {
			out.write(len);
		long endTime=System.currentTimeMillis();
		System.out.println("花费时间为:"+(endTime-beginTime)+"毫秒");
		in.close();
		out.close();
			
		}

	}

}
