package project0;

import java.util.Scanner;

public class CreateUserMenu extends ABCMenu {
	
	public CreateUserMenu(IMenuTree mt, Scanner s) {
		super(mt,s);
	}
	
	public void Run() {
		System.out.print("Select a user type:\n1. Customer\n2. Employee\n3. Admin\n");
		this.selection = s.nextLine();
		this.Execute();
	}
	
	private void Execute() {
		switch(this.selection) {
		case "1":
		case "1.":
			mt.menu("CreateCustomer");
			break;
		case "2":
		case "2.":
			mt.menu("CreateEmployee");
			break;
		case "3":
		case "3.":
			mt.menu("CreateAdmin");
			break;
		default:
			System.out.println("Your input was not understood");
			mt.menu("CreateUser");
		}
	}

}
