package com.liantianchengxu;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ChatReceiver implements Runnable {
	private DatagramSocket server;
	public ChatReceiver (DatagramSocket server) {
		this.server=server;
	}
	@Override
	public void run() {
		try {
			byte[] buf=new byte[1024];
			DatagramPacket packet=new DatagramPacket(buf,buf.length);
			while (true) {
				server.receive(packet);
				 String str=new String (packet.getData(),"UTF-8");
				 System.out.println("收到"+packet.getAddress()+":"+packet.getPort()+"发送消息:"+str);
				 
				
				}
			}catch (Exception e) {
				e.printStackTrace();
		}
	}
}
