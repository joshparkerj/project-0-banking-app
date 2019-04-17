package project0;

import java.util.Scanner;

public abstract class ABCMenu {

	protected String selection;
	protected MenuTree mt;
	protected Scanner s;
	
	public ABCMenu(MenuTree mt, Scanner s) {
		this.mt = mt;
		this.s = s;
	}
	
	public abstract void Run();
}
