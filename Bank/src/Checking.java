public class Checking extends Account {
	 String accountType; 
public Checking(Customer customer, String accountType) {
	super(customer,accountType);
	this.customer=customer;
	this.accountType=accountType;
}
}
