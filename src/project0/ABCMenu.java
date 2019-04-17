package project0;

import java.util.Scanner;

public abstract class ABCMenu {

	protected String selection;
	protected IMenuTree mt;
	protected Scanner s;
	
	public ABCMenu(IMenuTree mt, Scanner s) {
		this.mt = mt;
		this.s = s;
	}
	
	public abstract void Run();
}
