package com.jihe;

import java.util.ArrayList;
import java.util.Iterator;

public class E01 {

	public static void main(String[] args) {
		//创建arraylist集合
		ArrayList<String> list=new ArrayList<String>();
		//向该集合中添加字符串
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		//获取iterator对象
		Iterator<String> iterator=list.iterator();
		//判断集合中是否存在下一个元素
		while (iterator.hasNext()) {
			Object obj=iterator.next();
			System.out.println(obj);
			
			
		}
	}

}
