package com.String;

public class E54 {

	public static void main(String[] args) {
		String str="sadasdasdsaf1a7郭s旭3f0s7d2v9a7das9sdsad0dsas0";
		
		char[] charArray=str.toCharArray();  //字符串转换为字符数组
		System.out.println("将字符串转为字符数组的遍历结果:");
		for (int i=0;i<charArray.length;i++) {
			if(i !=charArray.length-1) {
				System.out.println(charArray[i]+",");
			}else {
				System.out.println(charArray[i]);
			}
		}
		System.out.print("字符串的数字是:");
		for(char zf:charArray) {
			if(zf>='0'  &&  zf<='9'){
				System.out.print(zf);
			}
		}
		System.out.println("字符串中的汉字是:");
		for(char zf:charArray) {
			if(zf>='\uu4E00'  &&  zf<='\u9FA5'){
				System.out.print(zf);
			}
		}
		System.out.println("\n将int值转换为String类型之后的结果:"+String.valueOf(12));
		System.out.println("将字符串转换成大写之后的结果:"+str.toUpperCase());

	}

}
