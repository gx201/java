package com.jihe;

import java.security.Permissions;
import java.util.HashSet;

class person{
	String id;
	int age;
	public person(String id,int age) {
		this.id=id;
		this.age=age;
	}

@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		person other=(person) obj;
		return id.equals(other.id);
	}
@Override
	public String toString() {
		return id + ":"+age;
	}
}
public class E09 {

	public static void main(String[] args) {
			HashSet<Object> hs=new HashSet<Object>();
			hs.add(new person("Jack", 20));
			hs.add(new person("Jack", 10));
			hs.add(new person("Rose", 21));
		
	}

}
