package com.io;

import java.io.*;


public class E03 {

	public static void main(String[] args) throws IOException {
		FileReader fileReader=new FileReader("d:\\reader.txt");
		int len=0;
		while((len=fileReader.read())!=-1) {
			System.out.println((char)len);
		}
		fileReader.close();
		
		
		FileWriter fileWriter=new FileWriter("d:\\writer.txt");
		fileWriter.write("惊\r\n");
		fileWriter.write("惊\r\n");
		fileWriter.write("惊\r\n");
		fileWriter.write("惊\r\n");
		fileWriter.close();
	}

}
