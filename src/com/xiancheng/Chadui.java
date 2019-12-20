package com.xiancheng;
class EmergncyThread implements Runnable{
		public void run() {
			for(int i=1; i<6; i++) {
				System.out.println(Thread.currentThread().getName()+"输入:"+i);
		}
	}
}
public class Chadui {

	public static void main(String[] args) throws Exception {
		Thread t1=new Thread(new EmergncyThread(),"t1");
		t1.start();
		for(int i=1; i<6; i++) {
			System.out.println(Thread.currentThread().getName()+"输入"+i);
			if(i==2) {
				t1.join();
			}
		}

	}

}
