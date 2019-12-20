package com.jihe;

import java.util.ArrayList;

public class E02 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		//使用foreach循环遍历集合
		for(Object obj:list) {
			System.out.println(obj);
		}

	}

}
