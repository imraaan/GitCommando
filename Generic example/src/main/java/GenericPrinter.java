
public class GenericPrinter<T> {
	T thing;
	
	public GenericPrinter(T thing) {
		this.thing = thing; 
	}
	
	public void print() {
		System.out.println(thing);
	}
}
