package project0;

public class MenuTree implements IMenuTree {

	private IMenu DepositMenu;
	private IMenu WithdrawMenu;
	private IMenu TransferMenu;
	private IMenu CloseAccountMenu;
	private IMenu AccountMenu;
	
	public MenuTree() {
		this.DepositMenu = new DepositMenu(this);
		this.WithdrawMenu = new WithdrawMenu(this);
		this.TransferMenu = new TransferMenu(this);
		this.CloseAccountMenu = new CloseAccountMenu(this);
		this.AccountMenu = new AccountMenu(this);
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
}
