package torstring.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class Main {

	public static void main(String[] args) {
		Test test=new Test();
		
		
		ArrayList arrayList=new ArrayList<>();
		long kssj1=System.currentTimeMillis();
		test.ListTest(arrayList);
		long jssj1=System.currentTimeMillis();
		System.out.println("用arrayList插入15万个元素花费"+(jssj1-kssj1)+"毫秒");
		
		
		LinkedList linkedList=new LinkedList<>();
		long kssj2=System.currentTimeMillis();
		test.ListTest(linkedList);
		long jssj2=System.currentTimeMillis();
		System.out.println("用Linkedlist插入15万个元素花费"+(jssj2-kssj2)+"毫秒");

		
		
		long kssj3=System.currentTimeMillis();
		test.ListTest(arrayList);
		long jssj3=System.currentTimeMillis();
		System.out.println("用arrayList读取15万个元素花费"+(jssj3-kssj3)+"毫秒");
	}

}
class Test{
	public void ListTest(List list) {
		for(int i=0;i<150000;i++) {
			list.add(0,i);
		}
	}
	public void listRead(List list) {
		for(int i=150000-1; i>=0; i--);
		list.get(0);
	}
}