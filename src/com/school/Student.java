package com.school;

public class Student {
	//定义两个成员变量
	//private:类可见性 当前属性只能在本类中被访问
	//将成员变量定义为私有的，就是类的封装
	//外部方法要访问这个成员变量，必须通过公有的getter setter方法
	private String Xingming;
	//没有修饰符：包可见性 当前属性只能在本包中被访问
	private int Chengji;
	//如果没有定义任何构造方法，java虚拟机会自动创建一个无参的构造方法
	//不管什么情况 都给类添加一个无参数的构造方法
	//定义无参的构造方法：
	//构造方法是一种特殊的方法：修饰符+类名([参数类型 参数名]){}
	public Student() {}
	//定义有参的构造方法
	public Student(String Xingming, int Chengji) {
	
		this.Xingming = Xingming;
		this.Chengji = Chengji;
	}
	//get ：获取 set:设置
	public String getXingming() {
		return Xingming;
	}

	public void setXingming(String xingming) {
		this.Xingming = xingming;
	}
	public int getChengji() {
		return Chengji;
	}
	public void setChengji(int chengji) {
		this.Chengji = chengji;
	}

	}


