package project0;

public class MenuTree implements IMenuTree {

	private IMenu DepositMenu;
	
	public MenuTree() {
		this.DepositMenu = new DepositMenu(this);
	}
	
	public void deposit() {
		this.DepositMenu.Run();
	}
}
