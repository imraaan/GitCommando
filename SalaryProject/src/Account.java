
abstract public class Account {
Contributor contributor;
String accountType;
public Contributor getContributor() {
	return contributor;
}
public void setContributor(Contributor contributor) {
	this.contributor = contributor;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public Account(Contributor contributor, String accountType) {
	super();
	this.contributor = contributor;
	this.accountType = accountType;
}

}
