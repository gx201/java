package com.io;
import java.io.*;

public class E01 {

	public static void main(String[] args) throws IOException{
		FileInputStream in=new FileInputStream("D:\\test.txt");
		int b=0;
		while((b=in.read())!=-1) {
			System.out.println(b);
		}
		//关闭流
		in.close();
		
		FileOutputStream out=new FileOutputStream("D:\\out.txt");
		String str="hello";
		out.write(str.getBytes());
		out.close();
	}

}
