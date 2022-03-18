

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class CustomerTest {
	
	@Test
	public void testSerialize() {
		Customer a = new Customer("customer\tfiona128\tsomebodyLovesYou\t1885");
		assertEquals("customer\tfiona128\tsomebodyLovesYou\t1885\n",a.serialize());
	}

}
