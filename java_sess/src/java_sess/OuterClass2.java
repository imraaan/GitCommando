package java_sess;

public class OuterClass2 {
	private int serialNo  = 10;
	class InnerClass {
		int getValue() {
			return serialNo;
		}
	}
	public class MemberInnerClass2{
	public static void main(String [] args) {
		OuterClass2 oc = new OuterClass2();
		
	}
}
}
