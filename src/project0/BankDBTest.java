package project0;

import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BankDBTest {

	@Test
	public void testGetDB() {
		BankDB.setFilename("DefaultData.txt");
		try {
			IDB a = BankDB.getDB();
			IDB b = BankDB.getDB();
			assertEquals(a, b);
		} catch (Exception e) {
			fail("Unexpected Exception thrown...");
		}
	}

}
