package project0;

import java.util.Scanner;

public class MenuTree implements IMenuTree {

	private Scanner Scanner;
	private ABCMenu DepositMenu;
	private ABCMenu WithdrawMenu;
	private ABCMenu TransferMenu;
	private ABCMenu CloseAccountMenu;
	private ABCMenu AccountMenu;
	private ABCMenu SplashMenu;
	private ABCMenu CreateUserMenu;
	private ABCMenu LoginMenu;
	private ABCMenu CreateCustomerMenu;
	private ABCMenu CreateEmployeeMenu;
	private ABCMenu CreateAdminMenu;
	
	public MenuTree() {
		this.Scanner = new Scanner(System.in);
		this.DepositMenu = new DepositMenu(this,this.Scanner);
		this.WithdrawMenu = new WithdrawMenu(this,this.Scanner);
		this.TransferMenu = new TransferMenu(this,this.Scanner);
		this.CloseAccountMenu = new CloseAccountMenu(this,this.Scanner);
		this.AccountMenu = new AccountMenu(this,this.Scanner);
		this.SplashMenu = new SplashMenu(this,this.Scanner);
		this.CreateUserMenu = new CreateUserMenu(this,this.Scanner);
		this.LoginMenu = new LoginMenu(this,this.Scanner);
		this.CreateCustomerMenu = new CreateCustomerMenu(this,this.Scanner);
		this.CreateEmployeeMenu = new CreateEmployeeMenu(this,this.Scanner);
		this.CreateAdminMenu = new CreateAdminMenu(this,this.Scanner);
	}
	
	public void deposit() {
		this.DepositMenu.Run();
	}
	
	public void withdraw() {
		this.WithdrawMenu.Run();
	}
	
	public void transfer() {
		this.TransferMenu.Run();
	}
	
	public void closeAccount() {
		this.CloseAccountMenu.Run();
	}
	
	public void account() {
		this.AccountMenu.Run();
	}
	
	public void splash() {
		this.SplashMenu.Run();
	}
	
	public void createUser() {
		this.CreateUserMenu.Run();
	}
	
	public void login() {
		this.LoginMenu.Run();
	}
	
	public void createCustomer() {
		this.CreateCustomerMenu.Run();
	}
	
	public void createEmployee() {
		this.CreateEmployeeMenu.Run();
	}
	
	public void createAdmin() {
		this.CreateAdminMenu.Run();
	}
	
}
