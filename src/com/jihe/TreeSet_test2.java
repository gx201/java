package com.jihe;

import java.util.TreeSet;

class Tear implements Comparable<Object>{
	String name;
	int age;
	public Tear(String name,int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public int compareTo(Object obj) {
		Tear s=(Tear) obj;
		if(this.age-s.age>0) {
			return 1;
		}
		if(this.age-s.age==0) {
			return this.name.compareTo(s.name);
		}
		return -1;
	}
}
public class TreeSet_test2 {

	public static void main(String[] args) {
		TreeSet<Tear> ts=new TreeSet<Tear>();
		ts.add(new Tear("Rose", 19));
		ts.add(new Tear("Jack", 20));
		ts.add(new Tear("Rose", 21));
		ts.add(new Tear("Tom", 17));
		System.out.println(ts);
	}

}
