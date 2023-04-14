package com.sd.java.training;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class mainperson {

	public static void main(String[] args)throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Person obj = new Person();
		obj.setName("Imran");
		obj.setAddress("Mumbai");
		obj.setNumber(10);
		
		try {
			System.out.println("before serialization:");
			FileOutputStream fileOut = new FileOutputStream("C:\\Users\\M3115111\\Desktop\\personclassdemo.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(obj);
			out.close();
			fileOut.close();
			System.out.println("End of serialization:");
			
		}catch(IOException i) {
			i.printStackTrace();
		}
	
	try {
		System.out.println("before serialization:");
		FileInputStream fileIn = new FileInputStream("C:\\Users\\M3115111\\Desktop\\personclassdemo.txt");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		Person p1 = (Person)in.readObject();
		System.out.println(p1);
		in.close();
		fileIn.close();
		System.out.println("End of serialization:");
		
	}catch(IOException i) {
		i.printStackTrace();
	}
}


}
