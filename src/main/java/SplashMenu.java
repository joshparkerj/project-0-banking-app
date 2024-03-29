import java.util.Scanner;

public class SplashMenu extends ABCMenu {
	
	public SplashMenu(MenuTree mt, Scanner s) {
		super(mt,s);
	}
	
	public void Run() {
		System.out.println("Welcome to the Banking App!");
		System.out.println("Please choose from the following options:\n1.Create New User\n2.Login Existing User\n3.Quit");
		this.selection = s.nextLine();
		this.Execute();
	}
	
	private void Execute() {
		switch(this.selection) {
		case "1":
		case "1.":
			mt.menu("CreateUser");
			break;
		case "2":
		case "2.":
			mt.menu("Login");
			break;
		case "3":
		case "3.":
			break;
		default:
			System.out.println("Your selection was not understood.");
			mt.menu("Splash");
		}
	}
	
}
