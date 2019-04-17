package project0;

import java.util.Scanner;

public class LoginMenu extends ABCMenu {
	
	private String username;
	private String password;
	private String userid;
	private String usertype;
	
	public LoginMenu(IMenuTree mt, Scanner s) {
		super(mt,s);
	}
	
	public void Run() {
		System.out.print("Login as:\n1. Admin\n2. Employee\n3. Customer\n");
		this.selection = s.nextLine();
		System.out.println("Enter your username:");
		this.username = s.nextLine();
		System.out.println("Enter your password:");
		this.password = s.nextLine();
	}
	
	private void Execute() {
		try {
		switch(this.selection) {
		case "1":
		case "1.":
			this.usertype = "admin";
			this.userid = BankDB.getDB().getAdminID(this.username, this.password);
			break;
		case "2":
		case "2.":
			this.usertype = "employee";
			this.userid = BankDB.getDB().getEmployeeID(this.username, this.password);
			break;
		case "3":
		case "3.":
			this.usertype = "customer";
			this.userid = BankDB.getDB().getCustomerID(this.username, this.password);
			break;
		default:
			System.out.println("Your input was not understood.");
			this.userid = null;
			break;
		}
		if (this.userid != null) {
			UserSession.setInfo(this.usertype, this.userid);
			UserSession.getSession();
			switch(this.selection) {
			case "1":
			case "1.":
				mt.menu("Admin");
			case "2":
			case "2.":
				mt.menu("Employee");
			case "3":
			case "3.":
				mt.menu("Customer");
			}
		} else {
			System.out.println("Login failed");
			mt.menu("Login");
		}
		} catch (Exception e) {
			System.out.println("problem in login menu execute method");
		}
	}
	
}
