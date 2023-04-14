package java_sess;
import java.util.Scanner;

public class hello {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First namme:");
		String firstname= sc.next();
		System.out.println("Enter Last namme:");
		String lastname= sc.next();
		System.out.println("Enter Location:");
		String location= sc.next();
		
		System.out.println("Hello "+firstname + " " + lastname + " from "+ location);
		
		
	}
}
