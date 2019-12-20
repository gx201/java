package torstring.com;

import java.io.FileFilter;
import java.util.LinkedList;

public class EA8 {

	public static void main(String[] args) {
		LinkedList<String> Link=new LinkedList<String>();
		Link.add("stu1");
		Link.add("stu2");
		System.out.println(Link);
		Link.offer("offer");
		Link.push("push");
		System.out.println(Link);
		Object object=Link.peek();
		System.out.println(object);
		Link.removeFirst();
		Link.pollLast();
		System.out.println(Link);

	}

}
