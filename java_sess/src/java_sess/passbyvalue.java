package java_sess;

public class passbyvalue {
	public static void main(String[] args)
	{
		int x = 1;
		int y = 2;
		System.out.println("Values before Primitive Modification:");
		System.out.println("x = "+ x + " ; y = " + y);
		
		modifyPrimitiveTypes(x,y);
		System.out.println("Values after Primitive Modification:");
		System.out.println("x = "+ x + " ; y = " + y);
	}
	
	private static void modifyPrimitiveTypes(int x, int y)
	{
		x = 5;
		y = 10;
	}
}
