package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CheckPalindromeTest {
	
	private TheJourneyBegins tjb;
	
	@Before
	public void setup() {
		tjb=new TheJourneyBegins();
	}

	@Test 
	public void test1() {
		assertEquals(true, tjb.checkPalindrome("aabaa"));
	}
	
	@Test 
	public void test2() {
		assertEquals(false, tjb.checkPalindrome("abac"));
	}
	
	@Test 
	public void test3() {
		assertEquals(true, tjb.checkPalindrome("a"));
	}
	
	@Test 
	public void test4() {
		assertEquals(false, tjb.checkPalindrome("az"));
	}
	
	@Test 
	public void test5() {
		assertEquals(true, tjb.checkPalindrome("abacaba"));
	}
	
	@Test 
	public void test6() {
		assertEquals(true, tjb.checkPalindrome("z"));
	}
	
	@Test 
	public void test7() {
		assertEquals(false, tjb.checkPalindrome("aaabaaaa"));
	}
	
	@Test 
	public void test8() {
		assertEquals(false, tjb.checkPalindrome("zzzazzazz"));
	}
	
	@Test
	public void test9() {
		assertEquals(true, tjb.checkPalindrome("hlbeeykoqqqqokyeeblh"));
	}
	
	@Test
	public void test10() {
		assertEquals(true, tjb.checkPalindrome("hlbeeykoqqqokyeeblh"));
	}
}
