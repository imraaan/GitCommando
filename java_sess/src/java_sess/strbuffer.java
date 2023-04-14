package java_sess;

public class strbuffer {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Helllo");
		sb1.replace(1,4,"World");
		
		System.out.println(sb1);
		
		StringBuilder sb2 =  new StringBuilder("Welcome");
		
		sb2.insert(2,"sl");
		System.out.println(sb2);
}
}