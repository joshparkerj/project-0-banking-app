package project0;

public class Employee implements ISerializable {
	
	private String username;
	private String password;
	private String salary;
	private String supervisorID;
	private String branch;
	private String EmployeeID;
	private String FirstName;
	private String LastName;

	public Employee(String a) {
		String[] b = a.split("\t");
		this.username = b[1];
		this.password = b[2];
		this.salary = b[3];
		this.supervisorID = b[4];
		this.branch = b[5];
		this.EmployeeID = b[6];
		this.FirstName = b[7];
		this.LastName = b[8];
	}
	
	public String serialize() {
		return "employee\t" +
               this.username + "\t" +
               this.password + "\t" +
               this.salary + "\t" +
               this.supervisorID + "\t" +
               this.branch + "\t" +
               this.EmployeeID + "\t" +
               this.FirstName + "\t" +
               this.LastName + "\n";
	}
}
