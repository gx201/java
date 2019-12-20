package com.xiancheng;
class DamonThread implements Runnable{
	@Override
	public void run() {
	int i=0;
	while (i++<5) {
		System.out.println(Thread.currentThread().getName()+"---在运行");
		}
	}
}
public class T5 {

	public static void main(String[] args) {
		if(!Thread.currentThread().isDaemon()) {
			System.out.println("main线程是后台线程");
		}
		
		DamonThread dt=new DamonThread();
		Thread t=new Thread(dt,"后台线程");
		
		//将线程thread线程对象设置为后台线程
		t.setDaemon(true);
		t.start();
		if(t.isDaemon()) {
			System.out.println("thread线程是后台线程");
		}
		//模拟主线程main的执行任务
		for(int i = 0 ;i < 5;i++){
			System.out.println(i);
		}
	}

}
