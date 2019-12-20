package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class M3 {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("1","Jack");
		map.put("2","Rose");
		map.put("3","Lucy");
		System.out.println(map);
		System.out.println("foreach遍历集合输出");
		
		Set<?> entrySet=map.entrySet();
		Iterator<?> it=entrySet.iterator();					//获取Iterator对象
		while (it.hasNext()) {
															//获取集合中键值对映射关系
			Map.Entry entry=(Map.Entry) (it.next());		
			Object key=entry.getKey();						//获取Entry中的键
			Object value=entry.getValue();					//获取Entry中的值
			System.out.println(key+":"+value);
			
		}
		map.forEach((key,value)->System.out.println(key+":"+value));
		Collection<String> values=map.values();
		values.forEach(v->System.out.println(v));
	}

}
