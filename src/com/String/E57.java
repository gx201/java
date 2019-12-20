package com.String;



public class E57 {

	public static void main(String[] args) {
	
		System.out.println("1.添加-----------------");
		add();
		System.out.println("1.添加-----------------");
		update();
		System.out.println("1.添加-----------------");
		delete();
	}
	//添加
	public static void add() {
		StringBuffer sb=new StringBuffer();//定义一个字符串缓冲区
		sb.append("ABC");
		System.out.println("append 添加结果:"+sb);
		sb.insert(3,"DE");
		System.out.println("insert 添加结果:"+sb);
	}
	private static void update() {
		StringBuffer sb=new StringBuffer("ABAAA");
		sb.setCharAt(2,'c');
		System.out.println("修改指定位置字符结果:"+sb);
		sb.replace(3,5,"De");
		System.out.println("替换指定位置字符串结果:"+sb);
		System.out.println("字符串翻转结果:"+sb.reverse());
		
	}
	private static void delete() {
		StringBuffer sb=new StringBuffer("AABCDEFG");
	 	sb.delete(3,7);
		System.out.println("删除指定位置结果:"+sb);
		sb.delete(0,sb.length());
		System.out.println("清空缓冲区结果:"+sb);
		
	}

	

}
