package project0;

public class Account implements ISerializable {
	
	private String owner_ssn;
	private String balance;
	private String account_number;
	private String type;
	
	public Account(String a) {
		String[] b = a.split("\t");
		this.owner_ssn = b[1];
		this.balance = b[2];
		this.account_number = b[3];
		this.type = b[4];
	}
	
	public String serialize() {
		return "account\t" +
	               this.owner_ssn + "\t" +
	               this.balance + "\t" +
	               this.account_number + "\t" + 
	               this.type + "\n";
	}
	
	public String getAccountNumber() {
		return this.account_number;
	}
	
	public String getOwnerSSN() {
		return this.owner_ssn;
	}
	
}
