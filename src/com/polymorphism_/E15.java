package com.polymorphism_;
//定义抽象类 Animal
	abstract class Animal{
		abstract void shout();
	}
	//定义 Cat类继承Animal抽象类
	class Cat extends Animal{

		@Override
		public void shout() {
				System.out.println("喵喵...... ");
			
		}

		public void catchMouse() {
			System.out.println("猫捉老鼠");
			
		}
	}	
	class Dog extends Animal{

		@Override
		public void shout() {
				System.out.println("汪汪...... ");
			
		}
	}
		public class E15{
	public static void main(String[] args) {
		
		Animal an1=new Cat();
		an1.shout();
		Animal an2=new Dog();
		an2.shout();
		//对象 instanceof 类 instanceof关键字表示左边对象是右边类的实例
		if (an1 instanceof Cat) {
			Cat mao=(Cat)an1;
			mao.catchMouse();
		}
		else {
			System.out.print("该类型的对象不是Cat类");
		}
		if (an2 instanceof Cat) {
			Cat mao=(Cat)an1;
			mao.catchMouse();
		}
		else {
			System.out.print("该类型的对象不是Cat类");
		}
	}
	
}