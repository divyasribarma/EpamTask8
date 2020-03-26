package epam.TddJunit;
import static org.junit.Assert.*;
import org.junit.Test;

public class DeleteTestA {

	/*
	 *  “ABCD” => “BCD” 
     *  “AACD” => “CD”  
     *  “BACD” => “BCD” 
     *  “BBAA” => “BBAA”        
     *  “AABAA” => “BAA” 
	 */
	@Test
	public void test1st() {
		assertEquals("BCD",DeleteA.remove("ABCD"));
	}
	@Test
	public void testFirst2() {
		assertEquals("CD",DeleteA.remove("AACD"));
	}
	@Test
	public void test2nd() {
		assertEquals("BCD",DeleteA.remove("BACD"));
	}
	@Test
	public void testLast() {
		assertEquals("BBAA",DeleteA.remove("BBAA"));
	}
	@Test
	public void testRandom() {
		assertEquals("BAA",DeleteA.remove("AABAA"));
	}
	@Test
	public void testEmpty() {
		assertEquals("",DeleteA.remove(""));
	}

}