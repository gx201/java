package com.school;

public class Ceshi {

	public static void main(String[] args) {
		// student是类名 S1是这个类的对象名
		//new关键字用来创建一个student类，类名后面要有小括号
		Student s1=new Student();
		
		
		s1.setXingming("mike");
		s1.setChengji(580);
		
		
		System.out.println(s1.getXingming()+"考了"+s1.getChengji());

	}

}
