import java.util.Scanner;
import java.lang.reflect.InvocationTargetException;

public class MenuTree {

	private Scanner Scanner;

	public MenuTree() {
		this.Scanner = new Scanner(System.in);
	}

	public void menu(String menuOption) {
		try {
			Class<?> cls = Class.forName("project0." + menuOption + "Menu");
			ABCMenu menu = (ABCMenu)cls.getConstructor(MenuTree.class, Scanner.class).newInstance(this, this.Scanner);
			menu.Run();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}		
	}
	
}
