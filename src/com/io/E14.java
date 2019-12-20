package com.io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.RandomAccess;

import javax.print.attribute.Size2DSyntax;

public class E14 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile infile=new RandomAccessFile("source/src.jpg", "rw");
		FileChannel inChannel=infile.getChannel();
		RandomAccessFile outfile=new RandomAccessFile("target/dest.jpg","rw");
		FileChannel outChannel=outfile.getChannel();
		long transferTo=inChannel.transferTo(0, inChannel.size(),outChannel);
		if(transferTo>0) {
			System.out.println("复制成功！");
		}
		infile.close();
		inChannel.close();
		outChannel.close();
		outfile.close();
	}

}
