package project0;

public class AccountMenu implements IMenu {
	
	private String selection;
	private IMenuTree mt;
	
	public AccountMenu(IMenuTree mt) {
		this.mt = mt;
	}

	public void Run() {
		System.out.print("Please choose from the following options: \n1. Make a deposit\n2. Make a withdrawal\n3. Make a transfer\n4. Close account\n\n");
		this.selection = System.console().readLine();
		Execute(selection);
	}
	
	private void Execute(String selection) {
		switch (selection) {
		case "1":
		case "1.":
			mt.deposit();
			break;
		case "2":
		case "2.":
			mt.withdraw();
			break;
		case "3":
		case "3.":
			mt.transfer();
			break;
		case "4":
		case "4.":
			mt.closeAccount();
			break;
		default:
			System.out.println("Your selection was not understood.");
			mt.account();
		}
	}
}
