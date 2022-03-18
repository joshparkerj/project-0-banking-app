

import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import java.util.*;

public class TextFileTest {

	private ITextFile a;

	public TextFileTest() {
		try {
			a = new TextFile("DefaultData.txt");
		} catch (Exception e) {
			System.out.print(e);
			a = new TextFileDummy();
		}

	}

	@Test
	public void testGetAccounts() {
		List<Account> b = this.a.getAccounts();
		assertEquals("account\t1885\t$88.11\t90001\tsavings\n", b.get(0).serialize());
		assertEquals("account\t1885\t$14.82\t90001\tchecking\n", b.get(1).serialize());
	}

	@Test
	public void testGetAdmins() {
		List<Admin> c = a.getAdmins();
		assertEquals("admin\tdoug001\thelloworld\t35000\t003\tDallas\t003\tDouglas\tCenteno\n", c.get(0).serialize());
		assertEquals("admin\tpikachu\tpikapika\t750\t003\tDallas\t005\tHuey\tLewis\n", c.get(1).serialize());
		assertEquals("admin\tethel064\tabcdefg\t100000\t003\tTruth Or Consequences\t007\tCat\tDog\n",
				c.get(2).serialize());
		assertEquals("admin\tbubba008\thello\t100000\t003\tIdaho Falls\t009\tOrca\tPorpoise\n", c.get(3).serialize());
	}

	@Test
	public void testGetCustomers() {
		List<Customer> d = a.getCustomers();
		assertEquals("customer\tfiona128\tsomebodyLovesYou\t1885\n", d.get(0).serialize());
		assertEquals("customer\tcalypso016\trockon\t9103\n", d.get(1).serialize());
	}

	@Test
	public void testGetEmployees() {
		List<Employee> e = a.getEmployees();
		assertEquals("employee\trobLovesSurf\tpassword\t18000\t003\tMidlothian\t004\tRobert\tPalmer\n",
				e.get(0).serialize());
		assertEquals("employee\tGumby\tclaymation\t80000\t003\tMidlothian\t006\tDavid\tBeans\n", e.get(1).serialize());
		assertEquals("employee\tdonna032\tbadpassword\t10000\t003\tSan Francisco\t008\tFerret\tWeasel\n",
				e.get(2).serialize());
		assertEquals("employee\taaron004\t12345	1000000\t003\tSalt Lake City\t010\tOtter\tWobbegong\n",
				e.get(3).serialize());
	}

	@Test
	public void testTextFileConstructor() {
		try {
			new TextFile("bad file name");
			fail("no expected exception thrown");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void testWriteToDisc() {
		try {
			BankDB.setFilename("DefaultData.txt");
			a.writeToDisc(BankDB.getDB());
		} catch (Exception e) {
			fail("unexpected exception thrown");
			System.out.print(e);
		}
	}

}

// ****************************************************************************
//
// IMPORTANT:
//
// This test assumes that the contents of DefaultData.txt are as follows:
/*
 * admin doug001 helloworld 35000 003 Dallas 003 Douglas Centeno account 1885
 * $88.11 90001 savings employee robLovesSurf password 18000 003 Midlothian 004
 * Robert Palmer admin pikachu pikapika 750 003 Dallas 005 Huey Lewis warehouse
 * 87000 88 Pike St. Amarillo employee Gumby claymation 80000 003 Midlothian 006
 * David Beans customer fiona128 somebodyLovesYou 1885 admin ethel064 abcdefg
 * 100000 003 Truth Or Consequences 007 Cat Dog employee donna032 badpassword
 * 10000 003 San Francisco 008 Ferret Weasel customer calypso016 rockon 9103
 * admin bubba008 hello 100000 003 Idaho Falls 009 Orca Porpoise employee
 * aaron004 12345 1000000 003 Salt Lake City 010 Otter Wobbegong account 1885
 * $14.82 90001 checking
 */
//*****************************************************************************
