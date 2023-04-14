package java_sess;

public class factorial {
	
	public static void main(String[] args) {
		int fact=1;
		int numm=5;
		fact=factoriall(numm);
		System.out.println("Factorial of "+numm +" is "+ fact);
		
	}
	 public static int factoriall(int n) {
			if(n == 0)
				return 1;
			else
				return (n*factoriall(n-1));
		}

}
