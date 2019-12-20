package com.school;



public class Test1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Student s1=new Student();
		s1.setXingming("Pete");
		s1.setChengji(600);
		System.out.println(s1.getXingming()+"考了"+s1.getChengji());
		Student s2=new Student("Alice",590);
		System.out.println(s2.getXingming()+"考了"+s2.getChengji());
		
		
		Course c1=new Course();
		c1.setCourse_name("Java程序设计");
		c1.setCourse_book("Java程序入门");
		System.out.println(c1.getCourse_name()+"这门课程使用的教材是《"+c1.getCourse_book()+"》");
	}

}
