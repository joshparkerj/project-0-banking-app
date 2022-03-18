import java.util.Scanner;

public class CreateEmployeeMenu extends ABCMenu {

	private String username;
	private String password;
	private String salary;
	private String supervisorID;
	private String branch;
	private String EmployeeID;
	private String FirstName;
	private String LastName;

	public CreateEmployeeMenu(MenuTree mt, Scanner s) {
		super(mt, s);
	}

	public void Run() {
		System.out.println("Enter username: ");
		this.username = s.nextLine();
		System.out.println("Enter password: ");
		this.password = s.nextLine();
		System.out.println("Enter salary: ");
		this.salary = s.nextLine();
		System.out.println("Enter supervisor\'s id number: ");
		this.supervisorID = s.nextLine();
		System.out.println("Enter branch name: ");
		this.branch = s.nextLine();
		System.out.println("Enter employee\'s id number: ");
		this.EmployeeID = s.nextLine();
		System.out.println("Enter first name: ");
		this.FirstName = s.nextLine();
		System.out.println("Enter last name: ");
		this.LastName = s.nextLine();
		this.Execute();
	}

	private void Execute() {
		try {
			BankDB.getDB()
					.addEmployee(new Employee("admin\t" + this.username + "\t" + this.password + "\t" + this.salary
							+ "\t" + this.supervisorID + "\t" + this.branch + "\t" + this.EmployeeID + "\t"
							+ this.FirstName + "\t" + this.LastName));
			System.out.println("Employee added");
			mt.menu("Splash");
		} catch (Exception e) {
			System.out.print(e);
		}
	}

}
