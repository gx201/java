package com.xiancheng;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread5 implements Callable<Object>{
	public Object call() throws Exception {
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"的call（）方法在运行");
			
		}
		return i;
	}
	
}
public class Xianchengchi {

	public static void main(String[] args) throws Exception, ExecutionException {
		MyThread5 myThread5=new MyThread5();
		ExecutorService executor=Executors.newCachedThreadPool();
		Future<Object>result1=executor.submit(myThread5);
		Future<Object>result2=executor.submit(myThread5);
		executor.shutdown();
		System.out.println("thread-1返回结果："+result1.get());
		System.out.println("thread-1返回结果："+result2.get());
	}

}
