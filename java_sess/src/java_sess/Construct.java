package java_sess;

public class Construct {
	private int id;
	private String name;
	private int age;
	public Construct() {
		id = 0;
		name = "";
		age = 0;
	}
	public Construct(int i, String n, int b) {
		id = i;
		name = "n";
		age = b;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.print("Id:" + id + " ,Name:"+ name + "Age:" + age);
	}
	public static void main(String args[]) {
		Construct c1 = new Construct();
		c1.getId();
	}
	
}
