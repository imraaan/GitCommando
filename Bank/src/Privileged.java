public class Privileged extends Account {
	int overDraftLimit;

	public Privileged(Customer customer, String accountType, int overDraftLimit) {
		super(customer, accountType);
		this.overDraftLimit = overDraftLimit;
	}

	public void withdraw(Double amount) {
		if (amount <= balance || amount <= overDraftLimit)
			System.out.println("You are allowed to withdraw");
		else
			System.out.println("Insufficient funds for withdrawal");
	}

	public void display() {
		System.out.println("Overdraft Limit:" + overDraftLimit);
	}
}
