package project0;

public class AccountMenu implements IMenu {
	
	private String selection;
	IMenuTree mt;
	
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
		}
	}
}
