package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Serializable {

	public static void main(String[] args) throws  Exception {
		Person p1=new Person(20,"mike");
		FileOutputStream fout=new FileOutputStream("person.txt");
		ObjectOutputStream oout=new  ObjectOutputStream(fout);
		oout.writeObject(p1);
		
		ObjectInputStream oint=new ObjectInputStream(new FileInputStream("person.txt"));
		Person p=(Person) oint.readObject();
		System.out.println(p);
	}

}
