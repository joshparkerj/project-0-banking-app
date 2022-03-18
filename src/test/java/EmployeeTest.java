

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class EmployeeTest {
	
	@Test
	public void testSerialize() {
		Employee a = new Employee("employee\tGumby\tclaymation\t80000\t003\tMidlothian\t006\tDavid\tBeans");
		assertEquals("employee\tGumby\tclaymation\t80000\t003\tMidlothian\t006\tDavid\tBeans\n",a.serialize());
	}

}
