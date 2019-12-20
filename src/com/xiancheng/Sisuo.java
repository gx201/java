package com.xiancheng;

import org.apache.commons.math3.analysis.solvers.NewtonRaphsonSolver;

class DeadLockThread implements Runnable{
	static Object chopsticks=new Object();
	static Object knifeAndFork=new Object();
	private boolean flag;
	DeadLockThread(boolean flag){
		this.flag=flag;
	}
	public void run() {
		if(flag) {
			while(true) {
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName()+"---if---chopsiticks");
					synchronized (knifeAndFork) {
						System.out.println(Thread.currentThread().getName()+"---if---knifeAndFork");
					}
				}
			}
		}else {
			while(true) {
					synchronized (knifeAndFork) {
						System.out.println(Thread.currentThread().getName()+"---else---knifeAndFork");
						synchronized (chopsticks) {
							System.out.println(Thread.currentThread().getName()+"---else---chopsiticks");
					}
				}
			}
		}
	}
}
public class Sisuo {

	public static void main(String[] args) {
		DeadLockThread t1=new DeadLockThread(true);
		DeadLockThread t2=new DeadLockThread(false);
		new Thread(t1,"Chinese").start();
		new Thread(t2,"American").start();
	}

}
