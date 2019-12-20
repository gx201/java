package com.interface_;
//接口编译以后也是class文件
//

interface Animal{
	//abstract抽象
	//只有public static final 的成员常量
	//public static final三个关键字可以省略
	String ID="惊辉";
	//abstract 抽象
	//接口中的方法都是public abstract 
	//public abstract两个关键字可以省略
	void shout();
	//接口里可以有静态非抽象的方法
	static String getID(){
		return Animal.ID;
	}
}
interface LandAnimal extends Animal{
	void run();
} 

class Dog implements LandAnimal{
	//必须重写父类中的抽象方法
	@Override
	public void shout() {
		System.out.println("汪汪......");
		
	}
	@Override
	public void run() {
		System.out.println("惊辉打牛");
	}
}
public class E_3 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.shout();
		dog.run();
		System.out.println(Animal.ID);
	}

}

