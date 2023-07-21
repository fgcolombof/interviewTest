package com.cloudpay;

import static org.junit.Assert.assertEquals;
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
		assertTrue("Success because input string is larger than procesed string.",cad.length() > res.length());
	}

	@Test
	public void checkString() throws Exception {
		String cad = "11234TTTTttttthhhHHHHKkKkLLLiiii9999u";
		String res = stringShortener.encodeStr(cad);
		System.out.println("Input string: " + cad + ", execution result: " + res);
		assertTrue("Success because input string is larger than procesed string.",cad.length() > res.length());
	}

	@Test
	public void checkStringWith1Element() throws Exception {
		String cad = "a";
		String res = stringShortener.encodeStr(cad);
		System.out.println("Input string: " + cad + ", execution result: " + res);
		assertTrue("Fail because the input string has just one charater and procesed string will have 2 characters [character, character ocurrences] ",cad.length() > res.length());
	}
	
	@Test
	public void checkStringWirhfewReapetedCharcters() throws Exception {
		String cad = "abccd22g";
		String res = stringShortener.encodeStr(cad);
		System.out.println("Input string: " + cad + ", execution result: " + res);
		assertTrue("Fail because input string has a few repeated characters ",cad.length() > res.length());
	}
	
}
