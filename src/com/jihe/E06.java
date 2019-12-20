package com.jihe;

import java.util.HashSet;

public class E06 {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("Jack");
		set.add("Eve");
		set.add("Rose");
		set.add("Rose");
		//遍历输出set集合中的元素
		set.forEach(o->System.out.println(o));
		
		
		//无法向HashSet中插入重复元素，并且按照字母顺序排好
		//没有重复是因为集合里String类重写了hashCode方法和equals方法
		//没有重复是因为集合里Integer类重写了hashCode方法和equals方法
		//按照字母顺序排好是因为集合里String类重写了CompareTo方法
		//按照字母顺序排好是因为集合里Integer类重写了CompareTo方法
		
	}

}
