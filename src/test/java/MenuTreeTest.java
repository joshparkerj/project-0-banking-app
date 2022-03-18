

import org.junit.*;
import static org.junit.Assert.assertEquals;
import java.io.*;

public class MenuTreeTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void restoreStreams() {
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	}
	
	@Test
	public void testDeposit() {
		MenuTree mt = new MenuTree();
		mt.menu("Deposit");
		assertEquals("",outContent.toString());
	}
	
}
