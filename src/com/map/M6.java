package com.map;
import java.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.naming.LimitExceededException;


public class M6 {

	public static void main(String[] args) {
		List <String> list=new ArrayList<>();
		list.add("惊辉");
		list.add("李罡");
		list.add("王楚豫");
		list.add("九日");
		list.add("惊蛰");
		list.add("惊弓之鸟");
		Stream<String>stream=list.stream();
		Stream<String>stream2=stream.filter(i->i.startsWith("惊"));
		Stream<String>stream3=stream2.limit(2);
		stream3.forEach(j->System.out.println(j));
		System.out.println("=====");
		list.stream().filter(i->i.startsWith("惊")&&i.length()>2).limit(6).skip(2).
		forEach(x->System.out.println());
		List<String> xlb=list.stream().filter(i->i.startsWith("惊")).collect(Collectors.toList());
		System.out.println(xlb);
		String string=list.stream().filter(i->i.startsWith("惊")).collect(Collectors.joining(""));
		System.out.println(string);
	}

}
