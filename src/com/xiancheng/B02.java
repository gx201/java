package com.xiancheng;

import java.sql.CallableStatement;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class Qiuhe_thread implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		int sum=0;
		for (int i=1;i<11;i++) {
			sum+=i;
		}
		switch (Thread.currentThread().getName()) {
		case "线程1":
			
			break;
		case "线程2":
			sum+=10*10;
			break;
		case "线程3":
			sum+=20*10;
			break;
		case "线程4":
			sum+=30*10;
			break;
		case "线程5":
			sum+=40*10;
			break;
		case "线程6":
			sum+=50*10;
			break;
		case "线程7":
			sum+=60*10;
			break;
		case "线程8":
			sum+=70*10;
			break;
		case "线程9":
			sum+=80*10;
			break;
		case "线程10":
			sum+=90*10;
			break;

		default:
			break;
		}
		return sum;
	}
	
}

public class B02 {

	public static void main(String[] args) throws Exception, ExecutionException {
		Qiuhe_thread qh1=new Qiuhe_thread();
		FutureTask<Object> ft1=new FutureTask<Object>(qh1);
		new Thread(ft1,"线程1").start();
		System.out.println("线程1运行的结果是"+ft1.get());
		
		Qiuhe_thread qh2=new Qiuhe_thread();
		FutureTask<Object> ft2=new FutureTask<Object>(qh2);
		new Thread(ft2,"线程2").start();
		System.out.println("线程2运行的结果是"+ft2.get());
		
		Qiuhe_thread qh3=new Qiuhe_thread();
		FutureTask<Object> ft3=new FutureTask<Object>(qh3);
		new Thread(ft3,"线程3").start();
		System.out.println("线程3运行的结果是"+ft3.get());
		
		Qiuhe_thread qh4=new Qiuhe_thread();
		FutureTask<Object> ft4=new FutureTask<Object>(qh4);
		new Thread(ft4,"线程4").start();
		System.out.println("线程4运行的结果是"+ft4.get());
		
		Qiuhe_thread qh5=new Qiuhe_thread();
		FutureTask<Object> ft5=new FutureTask<Object>(qh5);
		new Thread(ft5,"线程5").start();
		System.out.println("线程5运行的结果是"+ft5.get());
		
		Qiuhe_thread qh6=new Qiuhe_thread();
		FutureTask<Object> ft6=new FutureTask<Object>(qh6);
		new Thread(ft6,"线程6").start();
		System.out.println("线程6运行的结果是"+ft6.get());
		
		Qiuhe_thread qh7=new Qiuhe_thread();
		FutureTask<Object> ft7=new FutureTask<Object>(qh7);
		new Thread(ft7,"线程7").start();
		System.out.println("线程7运行的结果是"+ft7.get());
		
		Qiuhe_thread qh8=new Qiuhe_thread();
		FutureTask<Object> ft8=new FutureTask<Object>(qh8);
		new Thread(ft8,"线程8").start();
		System.out.println("线程8运行的结果是"+ft8.get());
		
		Qiuhe_thread qh9=new Qiuhe_thread();
		FutureTask<Object> ft9=new FutureTask<Object>(qh9);
		new Thread(ft9,"线程9").start();
		System.out.println("线程9运行的结果是"+ft9.get());
		
		Qiuhe_thread qh10=new Qiuhe_thread();
		FutureTask<Object> ft10=new FutureTask<Object>(qh10);
		new Thread(ft10,"线程10").start();
		System.out.println("线程10运行的结果是"+ft10.get());
		int total=(int)ft1.get()+(int)ft2.get()+(int)ft3.get()
		+(int)ft4.get()+(int)ft5.get()+(int)ft6.get()+(int)ft7.get()
		+(int)ft8.get()+(int)ft9.get()+(int)ft10.get();
		System.out.println("十个线程相加的总和为:"+total);
		
	}

}
