
public class Printer {

	public static void main(String[] args) {
		show("String type ",420);
	}
	
	private static <T,V> void show(T thingtoprint,V secondthing) {
		System.out.println(thingtoprint+"Successfull");
		System.out.println(secondthing+" Successfull");
		
	}
}
