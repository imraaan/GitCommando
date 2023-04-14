package realtimeobject;

public class Person implements Walking{
	String hair;// haircolor is a part of hair and we can include hair instead
	int height;
	float weight;
	//method name should clearly specify the particular action to be performed
	
	//person interface implementing other interfaces would make it easy to maintain code
	public boolean eat() {
		return true;
		
	}
	public void walk() {
		System.out.println("person is walking");
	}
	public void play() {
		
	}
}
