public class Account {
	private String accountType;
	int balance;
	Customer customer;
	public Account(Customer customer, String accountType) {
		this.customer=customer;
		this.accountType=accountType;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getBalance() {
		
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}