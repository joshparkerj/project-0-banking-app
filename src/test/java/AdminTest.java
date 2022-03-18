

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class AdminTest {
	
	@Test
	public void testSerialize() {
		Admin a = new Admin("admin\tbubba008\thello\t100000\t003\tIdaho Falls\t009\tOrca\tPorpoise");
		assertEquals("admin\tbubba008\thello\t100000\t003\tIdaho Falls\t009\tOrca\tPorpoise\n",a.serialize());
	}

}
