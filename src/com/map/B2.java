package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class B2 {

	public static void main(String[] args) {
		Map<String,String> map=new TreeMap<String,String>();
		map.put("1","Jack");
		map.put("2","Rose");
		map.put("4","Lucy");
		map.put("5","John");
		map.put("3","Smith");
		System.out.println(map); 

		Map<String,String> map2=new TreeMap<String,String>(new CustomComparator());
		map2.put("1","Jack");
		map2.put("2","Rose");
		map2.put("4","Lucy");
		map2.put("5","John");
		map2.put("3","Smith");
		System.out.println(map2);
		Set<Entry<String, String>> entrySet=map.entrySet();
		Iterator<Entry<String, String>> it=entrySet.iterator();					//获取Iterator对象
		while (it.hasNext()) {
															//获取集合中键值对映射关系
			Map.Entry entry=(Map.Entry) (it.next());		
			Object key=entry.getKey();						//获取Entry中的键
			Object value=entry.getValue();					//获取Entry中的值
			System.out.println(key+":"+value);
			
		}
	}
}