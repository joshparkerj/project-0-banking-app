

import org.junit.*;
import java.util.Scanner;

public class SplashMenuTest {

	@Test
	public void testRun() {
		MenuTree mt = new MenuTree();
		Scanner s = new Scanner(System.in);
		SplashMenu splash = new SplashMenu(mt, s);
		System.out.println(splash.getClass().getCanonicalName());
	}
}
