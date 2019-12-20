package com.jihe;

import java.util.Comparator;
import java.util.TreeSet;

import org.omg.IOP.TAG_MULTIPLE_COMPONENTS;

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=(String)o2;
		int temp=s1.length()-s2.length();
		return 0;
	}
	
}
public class Teacher {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		//如果使用TreeSet默认的比较器插入字符串，则会使用字符串类的compareTo方法
		//按照英文字母或者数字的顺序进行排序插入集合
		//如果使用自定义的比较器Mycomparator插入字符串，则会使用自定义的比较器类的Compare方法
		//按照字符长度的顺序进行排序插入集合，如果长度相同，则TreeSet认为是同一元素，无法插入
		ts.add("stud1");
		ts.add("stud3");
		ts.add("stud6");
		ts.add("stud2");
		System.out.println(ts);
		TreeSet<String> ts2=new TreeSet<String>((o1,o2)->{
			String s1=(String)o1;
			String s2=(String)o2;
			return s1.length()-s2.length();
		});
		ts2.add("Jack");
		ts2.add("Helena");
		ts2.add("Eve");
		System.out.println(ts2);
	}

}
