package com.rola.dojo.bank;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SingleParserTest {

	private final SingleParser single_parser = new SingleParser();

	@Parameters(name="{0} = {1}")
	public static Collection<Object[]> createParameter() {
		return Arrays.asList(new Object[][] {
			{ input1, "1" },
			{ input2, "2" },
			{ input3, "3" },
			{ input4, "4" },
			{ input5, "5" },
			{ input6, "6" },
			{ input7, "7" },
			{ input8, "8" },
			{ input9, "9" },
			{ unknown, "?" }
		});
	}
	
	@Parameter(0)
	public String input;
	
	@Parameter(1)
	public String output;
	
	
	//@formatter:off

	private static String input1 = 
			"   " + 
			"  |" + 
			"  |" + 
			"   ";
	private static String input2 = 
			" _ " + 
			" _|" + 
			"|_ " + 
			"   ";
	private static String input3 = 
			" _ " + 
			" _|" + 
			" _|" + 
			"   ";
	private static String input4 = 
			"   " + 
			"|_|" + 
			"  |" + 
			"   ";
	private static String input5 = 
			" _ " + 
			"|_ " + 
			" _|" + 
			"   ";
	private static String input6 = 
			" _ " + 
			"|_ " + 
			"|_|" + 
			"   ";
	private static String input7 = 
			" _ " + 
			"  |" + 
			"  |" + 
			"   ";
	private static String input8 = 
			" _ " + 
			"|_|" + 
			"|_|" + 
			"   ";
	private static String input9 = 
			" _ " + 
			"|_|" + 
			" _|" + 
			"   ";
	private static String unknown = 
			" r " + 
			" _|" + 
			" _|" + 
			"   ";
	
	//@formatter:on
	
	
	@Test
	public void shouldParseParameters() {
		Assert.assertTrue(single_parser.parseSingle(input).equals(output));
	}	
	
}
