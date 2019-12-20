package com.net.tcp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import org.xml.sax.InputSource;

class ServerThread implements Runnable{
	private Socket socket;
	public ServerThread(Socket socket) {
		this.socket=socket;
	}
	public void run() {
		String ip=socket.getInetAddress().getHostAddress();
		int count=1;
		try {
			File parentFile=new File("D:\\upload\\");
			if(!parentFile.exists()) {
				parentFile.mkdir();
			}
			File file=new File(parentFile,ip+"("+count+").jpg");
			while(file.exists()) {
				file=new File(parentFile,ip+"("+(count++)+").jpg");
			}
			InputStream in=socket.getInputStream();
			FileOutputStream fos=new FileOutputStream(file);
			byte[] buf=new byte[1024];
			int len=0;
			while((len=in.read(buf))!=-1) {
				fos.write(buf,0,len);
			}
			OutputStream out=socket.getOutputStream();
			out.write("上传成功".getBytes());
			in.close();
			fos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class UploadTcpServer {

	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket=new ServerSocket(10001);
		while(true) {
			Socket client=serverSocket.accept();
			new Thread(new ServerThread(client)).start();
		}

	}

}
