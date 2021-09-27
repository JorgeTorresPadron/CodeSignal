package dad.codesignal;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class MakeArrayConsecutive2 {

	private EdgeoftheOcean eo;
	
	@Before
	public void setup() {
		eo = new EdgeoftheOcean();
	}
	
	@Test
	public void test1() {
		assertEquals(3, eo.makeArrayConsecutive2(new int [] {6, 2, 3, 8}));
	}
	
	@Test
	public void test2() {
		assertEquals(2, eo.makeArrayConsecutive2(new int [] {0, 3}));
	}
	@Test
	public void test3() {
		assertEquals(0, eo.makeArrayConsecutive2(new int [] {5, 4, 6}));
	}
	
	@Test
	public void test4() {
		assertEquals(2, eo.makeArrayConsecutive2(new int [] {6, 3}));
	}
	
	@Test
	public void test5() {
		assertEquals(0, eo.makeArrayConsecutive2(new int [] {1}));
	}
	
}
