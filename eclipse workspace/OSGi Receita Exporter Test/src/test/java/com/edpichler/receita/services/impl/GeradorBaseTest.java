package com.edpichler.receita.services.impl;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeradorBaseTest {

	@Test
	public void testFormatarString() {
		GeradorBase g = new GeradorBase() {			
		};
		String res = g.formatarString("", 2);
		assertEquals(2, res.length());
		res = g.formatarString(null, 2);
		assertEquals(2, res.length());
		res = g.formatarString("ABCDEFG", 2);
		assertEquals(2, res.length());
	}

}
