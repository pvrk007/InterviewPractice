import static org.junit.Assert.*;

import org.junit.Test;

public class reverseTest {

	@Test
	public void test() {
		stringReverse s =new stringReverse();
		String result=s.reverseString("mad");
		assertEquals("dam",result);
		String fin=s.reverseString("rama");
		assertEquals("amar",fin);
	}

}
