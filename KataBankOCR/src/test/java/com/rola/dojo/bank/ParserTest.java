package com.rola.dojo.bank;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class ParserTest {
	
	private final Parser parser = new Parser();

	//@formatter:off
	private String input123456789 = 
			  "    _  _     _  _  _  _  _ \n" + 
			  "  | _| _||_||_ |_   ||_||_|\n" + 
			  "  ||_  _|  | _||_|  ||_| _|\n" + 
			  "                           ";
	//@formatter:on

	private final String input0 = " _ \n" + 
			"| |\n" + 
			"|_|\n" +
			"   \n";	
	String input1= "   \n" + 
			"  |\n" + 
			"  |\n" + 
			"   \n";
	
	
	@Test
	public void shouldParse() {
		String expected =  "0" ;
		String actual = parser.parse(input0);
		
		Assert.assertThat(actual, Matchers.equalTo(expected)); 
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowUpOnNull() {
		parser.parse(null);
	}
	
	@Test
	public void shouldParseOneDigit() {
		String expected =  "1" ;
		String actual = parser.parse(input1);
		
		Assert.assertThat(actual, Matchers.equalTo(expected)); 
	}

	@Test
	public void shouldParse123456789() {
		Assert.assertThat(parser.parse(input123456789), Matchers.equalTo("123456789")); 
	}
}
