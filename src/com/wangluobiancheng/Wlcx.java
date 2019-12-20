package com.wangluobiancheng;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Wlcx {

	public static void main(String[] args) throws Exception {
		DatagramSocket server=new DatagramSocket(8900);
		byte[] buf=new byte[1024];
		DatagramPacket packet=new DatagramPacket(buf,buf.length);
		System.out.println("等待接收数据...");
		while(true) {
			server.receive(packet);
			String neirong=new String(packet.getData(),0,packet.getLength());
			System.out.println(packet.getAddress()+":"+packet.getPort()+"发送消息:"+neirong);
		}
	}
}
