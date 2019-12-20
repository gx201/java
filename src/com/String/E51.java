package com.String;

public class E51 {

	public static void main(String[] args) {
		String str1="直接赋值的字符串";
		String str2=new String();//创建一个空串
		String str3=new String("构造字符串时赋值的字符串");
		
		char[] charArray= {'字','符','数','组','中','的','字','符',};
		String str4=new String(charArray);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}

}
