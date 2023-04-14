package newpackage;

abstract public class class1 {
private String className;
public class1(String className) {
	this.className = className;
}
public abstract float getSum();

public void displaySum() {
	System.out.println(this.className + "Sum is " + getSum() + " ");
}
}