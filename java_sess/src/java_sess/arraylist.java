package java_sess;

import java.util.ArrayList;

public class arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> arrl= new ArrayList<>();
		arrl.add(1);
		arrl.add(1);
		arrl.add(1);
		arrl.add(1);
		System.out.println(arrl);
		for( int i  : arrl) {
			System.out.println(i);
		}
	}
}
