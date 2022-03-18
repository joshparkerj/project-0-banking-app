import java.util.Scanner;

public class CreateAdminMenu extends ABCMenu {
	
	private String username;
	private String password;
	private String salary;
	private String supervisorID;
	private String branch;
	private String EmployeeID;
	private String FirstName;
	private String LastName;
	
	public CreateAdminMenu(MenuTree mt, Scanner s) {
		super(mt,s);
	}
	
	public void Run() {
		System.out.println("Please enter your username:");
		this.username = s.nextLine();
		System.out.println("Please enter your password:");
		this.password = s.nextLine();
		System.out.println("Please enter your salary:");
		this.salary = s.nextLine();
		System.out.println("Please enter your supervisor\'s employee id number:");
		this.supervisorID = s.nextLine();
		System.out.println("Please enter your the name of your branch:");
		this.branch = s.nextLine();
		System.out.println("Please enter your employee id number:");
		this.EmployeeID = s.nextLine();
		System.out.println("Please enter your First Name/Given Name:");
		this.FirstName = s.nextLine();
		System.out.println("Please enter your Last Name/Family Name:");
		this.LastName = s.nextLine();
		this.Execute();
	}
	
	private void Execute() {
		try {
			BankDB.getDB()
				  .addAdmin(new Admin("admin\t" + this.username + "\t" + this.password + "\t" + this.salary + "\t" + this.supervisorID + "\t" + this.branch + "\t" + this.EmployeeID + "\t" + this.FirstName + "\t" + this.LastName));
			System.out.println("Admin added");
			mt.menu("Splash");
		} catch (Exception e) {
			System.out.print(e);
		}
	}
	
}
