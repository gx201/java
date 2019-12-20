package com.io;

import java.io.*;

public class E04 {

	public static void main(String[] args) throws IOException  {
		FileReader fileReader=new FileReader("d:\\reader.txt");
		FileWriter fileWriter=new FileWriter("d:\\writer.txt");
		int len=0;
		char[]buff=new char[1024];
		while((len=fileReader.read(buff))!=-1) {
			fileWriter.write(buff,0,len);
			
		}
		fileReader.close();
		fileWriter.close();
	}

}
