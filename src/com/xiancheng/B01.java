package com.xiancheng;

import javax.xml.stream.events.StartDocument;

class Teacher2 implements Runnable{
	private int tickets=80;
	public void run() {
		while(true) {
			if(tickets>0) {
				System.out.println(Thread.currentThread().getName()+
						"正在分发第"+tickets--+"份笔记");
			}
		}
	}
}
public class B01 {

	public static void main(String[] args) {
		Teacher2 tw=new Teacher2();
		new Thread(tw,"第1位老师").start();
		new Thread(tw,"第2位老师").start();
		new Thread(tw,"第3位老师").start();
	
	}
}