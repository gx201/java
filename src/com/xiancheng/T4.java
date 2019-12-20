package com.xiancheng;

import javax.xml.stream.events.StartDocument;

class TicketWindow2 implements Runnable{
	private int tickets=100;
	public void run() {
		while(true) {
			if(tickets>0) {
				System.out.println(Thread.currentThread().getName()+
						"正在发售第"+tickets--+"张票");
			}
		}
	}
}
public class T4 {

	public static void main(String[] args) {
		TicketWindow2 tw=new TicketWindow2();
		new Thread(tw,"窗口1").start();
		new Thread(tw,"窗口2").start();
		new Thread(tw,"窗口3").start();
		new Thread(tw,"窗口4").start();

	}

}
