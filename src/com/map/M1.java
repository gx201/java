package com.map;

import java.util.HashMap;
import java.util.Map;

public class M1 {

	public static void main(String[] args) {
		//左边的类或接口必须比右边的类大或者相等
		Map<String,String> hm=new HashMap<String,String>();
		//map存储的元素是一个键key+值value=对entry
		hm.put("1","Jack");
		hm.put("2","Rose");
		hm.put("3","Lucy");
		hm.put("1","Jacky");
		System.out.println(hm);
		if(hm.containsKey("1")) {
			System.out.println("双列集合hm包含键1");
			System.out.println("双列集合hm包含键1的值是"+hm.get("1"));
		
		}
		//通过keySet()和value（）方法获取键对象集合和值对象集合、
		//也就是把Map这个双列集合变成两个单列集合Set
		System.out.println("键对象集合是:"+hm.keySet());
		System.out.println("键对象集合是:"+hm.values());
		//修改集合中键为1的元素
		hm.replace("1","Mary");
		System.out.println(hm);
		//删除集合中建为1的元素
		hm.remove("1");
		System.out.println(hm);
		
	}

}
