package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class M2 {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();				//创建Map集合
		map.put("1","Jack");				//存储元素
		map.put("2","Rose");
		map.put("3","Lucy");
		System.out.println(map);
		Set<String> keySet=map.keySet();			//获取键的集合
		Iterator<String> it=keySet.iterator();		//迭代键的集合
		while (it.hasNext()) {
			Object key=it.next();
			Object value=map.get(key);		//获取每个键所对应的值
			System.out.println(key+":"+value);
			
		}

	}

}
