package com.String;

public class E56 {

	public static void main(String[] args) {
		String str="2019-10-12";
		System.out.println("今天是"+str.substring(8)+"号");
		System.out.println("今天是"+str.substring(5,7)+"月");
		System.out.println("今年是"+str.substring(0,4)+"年");
		System.out.println("分割后的字符串数组中的元素依次为:");
		String[]strArray=str.split("-");
		for(int i=0;i<strArray.length;i++) {
			if(i !=strArray.length-1) {
				System.out.println(strArray[i]+"、");
			}else {
				System.out.println(strArray[i]);
			}
		}
	}

}
