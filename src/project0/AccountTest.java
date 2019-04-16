package project0;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class AccountTest {
	
	@Test
	public void testSerialize() {
		Account a = new Account("account\t1885\t$88.11\t90001\tsavings");
		assertEquals("account\t1885\t$88.11\t90001\tsavings\n",a.serialize());
	}

}
