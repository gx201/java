package com.io;
import java.io.*;
public class E05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("d://reader.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("d://writer.txt"));
		String str=null;
		while((str=br.readLine())!=null) {
			bw.write(str);
			bw.newLine();
		}
		br.close();
		bw.close();
	}

}
