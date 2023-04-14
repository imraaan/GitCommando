package java_sess;

public class StaticOuter {

		private  static int serialNo  = 10;
		 static class InnerClass {
			int getValue() {
				return serialNo;
			}
		}
		void displaySerialNo() {
			InnerClass ic = new InnerClass();
			System.out.println("Sr. Number:" + ic.getValue());
		}
	public static void main(String [] args) {
		OuterClass oc = new OuterClass();
		oc.displaySerialNo();
	}
	}


