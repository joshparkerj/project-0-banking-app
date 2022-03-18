import java.util.Scanner;

public class CustomerMenu extends ABCMenu {
	
	public CustomerMenu(MenuTree mt, Scanner s) {
		super(mt,s);
	}

	@Override
	public void Run() {
		System.out.println("Please choose from the following options:\n1. Create account");
		this.selection = s.nextLine();
		this.Execute();
	}
	
	private void Execute() {
		switch (this.selection) {
		case "1":
		case "1.":
			mt.menu("CreateAccount");
			break;
		default:
			System.out.println("Your input was not understood");
			mt.menu("Customer");
		}
	}
	

}
