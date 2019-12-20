package com.liantianchengxu;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatSend implements Runnable{

	private DatagramSocket client;
	private int port;
	public ChatSend(DatagramSocket client,int port) {
		this.client=client;
		this.port=port;
	}
	public void run() {
		Scanner sc=new Scanner(System.in);
			while (true) {
				try {
					
					String str=sc.nextLine();
					byte[] hcqsz=str.getBytes("UTF-8");
					DatagramPacket packet=new DatagramPacket(hcqsz,hcqsz.length,
						InetAddress.getByName("10.2.103.46"),port);
				
					client.send(packet);
				
				
				}catch (Exception e) {
					e.printStackTrace();
		}
		}
		
	}

}
