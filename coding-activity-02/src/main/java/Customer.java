
public class Customer {
	private String firstName;
	private String lastName;
	private double amountLoan;
	private int terms;
	private int monthsOfContribution;
	
	public void displayDetails() {
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Loan Amount: " + amountLoan);
		System.out.println("Months of Contribution: " + monthsOfContribution);
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getAmountLoan() {
		return amountLoan;
	}

	public void setAmountLoan(double amountLoan) {
		this.amountLoan = amountLoan;
	}

	public int getTerms() {
		return terms;
	}

	public void setTerms(int terms) {
		this.terms = terms;
	}

	public int getMonthsOfContribution() {
		return monthsOfContribution;
	}

	public void setMonthsOfContribution(int monthsOfContribution) {
		this.monthsOfContribution = monthsOfContribution;
	}
}
