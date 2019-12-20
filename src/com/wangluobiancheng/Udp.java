package com.wangluobiancheng;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Udp {

	public static void main(String[] args) throws Exception {
		DatagramSocket client=new DatagramSocket(3000);
		String str="来自旭某人的爆头一击";
		byte[] hcqsz=str.getBytes("UTF-8");
		DatagramPacket packet=new DatagramPacket(hcqsz,hcqsz.length,
				InetAddress.getByName("10.2.103.87"),8900);
		DatagramPacket packet1=new DatagramPacket(hcqsz,hcqsz.length,
				InetAddress.getByName("10.2.103.9"),8900);
		DatagramPacket packet2=new DatagramPacket(hcqsz,hcqsz.length,
				InetAddress.getByName("10.2.103.46"),8900);
		System.out.println("开始发送信息...");
		client.send(packet);
		client.send(packet1);
		client.send(packet2);
		client.close();

	}

}
