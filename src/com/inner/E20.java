package com.inner;
interface Animal{
	void shout();
}
class Cat implements Animal{
	@Override
	public void shout() {
		System.out.println("miaomaio");	
	}
}
public class E20 {
	public static void main(String[] args) {
		String name="花猫";
		//第一种方式：
			//外部类  外部类的对象=new  外部类（）创建对象
		Cat cat=new Cat();
		cat.shout();
		
		//第二种方式
		//匿名内部类，作为方法的参数  有具体的实现
		animalshout(new Animal() {
			
			@Override
			public void shout() {
				System.out.println(name+"miaomaio");	
			}
		});
		//用lambada表达式作为参数传递给animalshout方法
		animalshout(()->System.out.println(name+"miaomaio"));
		
	}
	private static void animalshout(Animal an) {
		an.shout();
	}
}
