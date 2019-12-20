package com.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class M7 {

	public static void main(String[] args) {
		Integer[] array= {9,8,3,5,2};
		List<Integer>list=Arrays.asList(array);
		Stream<Integer> stream=list.stream();
		stream.forEach(i->System.out.println(i+""));
		System.out.println();
		Stream<Integer>stream2=Stream.of(array);
		stream2.forEach(i->System.out.println(i+""));

	}

}
