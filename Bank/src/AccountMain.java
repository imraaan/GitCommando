
public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer("ABC","XYZ");
		Account sc= new Account(customer,"Savings");
		Privileged pv = new Privileged(customer,"savings",1000);
		sc.setBalance(100);
		pv.withdraw(500.);
		pv.display();
		
				
	}
	

}
