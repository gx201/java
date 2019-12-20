package com.liantianchengxu;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

public class ChatRoom_test {

	public static void main(String[] args) throws Exception {
		/* Scanner sc=new Scanner(System.in);
		 System.out.print("请输入聊天服务当前启动端口号:");
		int serverPort=sc.nextInt();
		 System.out.print("请输入聊天服务发送信息对象的目标端口号:");
		 int targetPort=sc.nextInt();	
		 System.out.println("聊天系统初始化完成并启动！！！");*/
		int port = 3000;
			 DatagramSocket sender_socket=new DatagramSocket(5000);
			 DatagramSocket receiver_socket=new DatagramSocket(port);
			 new Thread(new ChatReceiver(receiver_socket),"接收服务");
			 new Thread(new ChatSend(sender_socket,port),"发送服务").start();
		 
		
	}

}
