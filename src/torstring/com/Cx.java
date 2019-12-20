package torstring.com;
//定义animal类
class Animal extends java.lang.Object{
	//重写父类Object中的toString方法

	@Override
 	public String toString() {
		return "这是一只动物";
	}
}
//定义Dog类继承Animal
class dog extends Animal{

	@Override
 	public String toString() {
		return "这是一只小狗";
	}
	

}
//定义测试值
public class Cx {

	public static void main(String[] args) {
		Animal dw=new Animal();
		dog  xg=new dog();
		System.out.println(dw.toString());
		System.out.println(xg.toString());

	}
}

