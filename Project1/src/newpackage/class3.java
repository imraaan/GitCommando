package newpackage;

 abstract public class class3 implements demoInterface ,interface1 {
	 private String className3;
	 public class3(String className) {
	 	this.className3 = className;
	 }
	public abstract float getSum();

	 public void displaySum() {
	 	System.out.println(this.className3 + "Sum is " + getSum() + " ");
	 }
}
