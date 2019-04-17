package project0;

import org.junit.*;
import static org.junit.Assert.assertEquals;
import java.util.Scanner;

public class SplashMenuTest {

	@Test
	public void testRun() {
		IMenuTree mt = new MenuTree();
		Scanner s = new Scanner(System.in);
		SplashMenu splash = new SplashMenu(mt, s);
		System.out.println(splash.getClass().getCanonicalName());
	}
}
