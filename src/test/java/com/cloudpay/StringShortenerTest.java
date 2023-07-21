package com.cloudpay;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StringShortenerTest {

	StringShortener stringShortener;

	@Before
	public void setUp() throws Exception {
		stringShortener = new StringShortener();
	}

	@Test
	public void checkStringAsSample() throws Exception {
		String cad = "AAAAAANNNMMMMYYYYuuuuUUUUaaaarWWLLLLJ888DDDDDDDD";
		String res = stringShortener.encodeStr(cad);
		System.out.println("Input string: " + cad + ", length: " + cad.length()+ ", execution result: " + res + ", length: " + res.length());
		assertTrue("Success because input string length is larger than output string length.",cad.length() > res.length());
	}

	@Test
	public void checkString() throws Exception {
		String cad = "11234TTTTttttthhhHHHHKkKkLLLiiii9999u";
		String res = stringShortener.encodeStr(cad);
		System.out.println("Input string: " + cad + ", execution result: " + res);
		assertTrue("Success because input string is larger length than output string length.",cad.length() > res.length());
	}

	@Test
	public void checkStringWith1Element() throws Exception {
		String cad = "a";
		String res = stringShortener.encodeStr(cad);
		System.out.println("Input string: " + cad + ", execution result: " + res);
		assertTrue("Fail because the input string length is shorter than output string length.",cad.length() > res.length());
	}
	
	@Test
	public void checkStringWithAFewReapetedCharacters() throws Exception {
		String cad = "abccd22g";
		String res = stringShortener.encodeStr(cad);
		System.out.println("Input string: " + cad + ", execution result: " + res);
		assertTrue("Fail because the input string length is shorter than output string length.",cad.length() > res.length());
	}
	
}
