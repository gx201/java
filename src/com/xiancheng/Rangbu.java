package com.xiancheng;
class YieldThread extends Thread{
	public YieldThread(String name) {
		super(name);
	}
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName()+"---"+i);
			if(i==2) {
				System.out.println("线程让步:");
				Thread.yield();
			}
		}
	}
}
public class Rangbu {

	public static void main(String[] args) {
		Thread t1=new YieldThread("t1");
		Thread t2=new YieldThread("t2");
		t1.start();
		t2.start();
	}

}
