package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ShapeAreaTest {
	
	private EdgeoftheOcean eo;
	
	@Before
	public void setup() {
		eo=new EdgeoftheOcean();
	}
	
	@Test
	public void test1() {
		assertEquals(5, eo.shapeArea(2));
	}
	
	@Test
	public void test2() {
		assertEquals(13, eo.shapeArea(3));
	}
	
	@Test
	public void test3() {
		assertEquals(1, eo.shapeArea(1));
	}
	
	@Test
	public void test4() {
		assertEquals(41, eo.shapeArea(5));
	}
	
	@Test
	public void test5() {
		assertEquals(97986001, eo.shapeArea(7000));
	}
	
	@Test
	public void test6() {
		assertEquals(127984001, eo.shapeArea(8000));
	}

	@Test
	public void test7() {
		assertEquals(199940005, eo.shapeArea(9999));
	}
	
	@Test
	public void test8() {
		assertEquals(199900013, eo.shapeArea(9998));
	}
	
	@Test
	public void test9() {
		assertEquals(161946005, eo.shapeArea(8999));
	}
	
	@Test
	public void test10() {
		assertEquals(19801, eo.shapeArea(100));
	}
}
