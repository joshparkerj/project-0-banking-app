package project0;

import org.junit.*;

public class AllTest {

	@Test
	public void testEverything() {
		AccountTest a = new AccountTest();
		a.testSerialize();
		AdminTest b = new AdminTest();
		b.testSerialize();
		CustomerTest c = new CustomerTest();
		c.testSerialize();
		EmployeeTest d = new EmployeeTest();
		d.testSerialize();
		TextFileTest e = new TextFileTest();
		e.testGetAccounts();
		e.testGetAdmins();
		e.testGetCustomers();
		e.testGetEmployees();
		e.testTextFileConstructor();
		e.testWriteToDisc();
		BankDBTest f = new BankDBTest();
		f.testGetDB();
		MenuTreeTest g = new MenuTreeTest();
		g.testDeposit();
	}

}
