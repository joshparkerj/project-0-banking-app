package project0;

import java.util.Scanner;

public class CreateAccountMenu extends ABCMenu {

	private String account_number;
	private String type;
	private String owner_ssn;
	
	public CreateAccountMenu(MenuTree mt, Scanner s) {
		super(mt,s);
	}
	
	public void Run() {
		System.out.println("Please enter the account type:");
		this.type = s.nextLine();
		System.out.println("Please enter the account number:");
		this.account_number = s.nextLine();
		this.Execute();
	}
	
	private void Execute() {
		this.owner_ssn = UserSession.getSession().getID();
		try {
			BankDB.getDB()
				  .addAccount(new Account("account\t" + this.owner_ssn + "\t$0.00\t" + this.account_number + "\t" + this.type));
			System.out.println("Account added");
			mt.menu("Splash");
		} catch (Exception e) {
			System.out.print(e);
		}
	}
	
}
