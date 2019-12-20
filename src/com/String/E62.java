package com.String;

public class E62 {

	public static void main(String[] args) {
		int[] srcArray= {101,102,103,104,105,106}; //源数组
		int[] destArry= {201,202,203,204,205};		//目标数组
		System.arraycopy(srcArray,1,destArry,0,4);	//拷贝数组元素
		//打印目标数组中的元素
		for(int i=0;i<destArry.length;i++) {
			System.out.println(i+":"+destArry[i]);
		}

	}

}
