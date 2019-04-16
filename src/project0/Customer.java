package project0;

public class Customer implements ISerializable {

	private String username;
	private String password;
	private String ssn;
	
	public Customer(String a) {
		String[] b = a.split("\t");
		this.username = b[1];
		this.password = b[2];
		this.ssn = b[3];
	}
	
	public String serialize() {
		return "customer\t" +
	               this.username + "\t" +
	               this.password + "\t" +
	               this.ssn + "\n";
	}
}
