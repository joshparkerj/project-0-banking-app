package project0;

import java.util.Scanner;

public class CreateCustomerMenu extends ABCMenu {

	private String username;
	private String password;
	private String SSN;

	public CreateCustomerMenu(IMenuTree mt, Scanner s) {
		super(mt, s);
	}

	public void Run() {
		System.out.println("Please enter your username: ");
		this.username = s.nextLine();
		System.out.println("Please enter your password: ");
		this.password = s.nextLine();
		System.out.println("Please enter your ssn: ");
		this.SSN = s.nextLine();
		this.Execute();
	}

	public void Execute() {
		try {
			BankDB.getDB()
				  .addCustomer(new Customer("customer\t" + this.username + "\t" + this.password + "\t" + this.SSN));
			System.out.println("Customer added");
			mt.splash();
		} catch (Exception e) {
			System.out.print(e);
		}
	}

}
