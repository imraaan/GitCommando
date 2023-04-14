package java_sess;


class Customer extends Account{
	String firstName;
	String lastName;
	
	Customer(String firstName , String lastName){
	
	}
	public void getFirstName() {
		
	}
	public void getLastName() {
		
	}
}
class Account{
	String accountType;
	double balance;
	Customer customer;
	Account(Customer customer , String accoutType){
		super();
	}
}
class Privileged{
	double overDraftLimit;
	
	Privileged(Customer customer , String accountType , double overDraftLimit){
		
	}
}
class Checking{
	Checking(Customer customer , String accoutType){
		
	}
}
class Savings{
	Savings(Customer customer , String accoutType){
		
	}
}

public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
