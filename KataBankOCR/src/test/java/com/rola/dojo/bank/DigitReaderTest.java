package com.rola.dojo.bank;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class DigitReaderTest {


	@Test(expected=IllegalArgumentException.class)
	public void testEmptyInput() throws Exception {
		
		DigitReader reader = new DigitReader();
		
		String input = "";
		int position = 0;
		reader.read(input, position);
	}
	
	@Test
	public void testInput0Position0() throws Exception {
		
		DigitReader reader = new DigitReader();
		
		String input = " _ \n" + 
				"| |\n" + 
				"|_|\n" + 
				"   \n";
		int position = 0;
		String output = reader.read(input, position);
		
		String expectedOutput = " _ " + 
				"| |" + 
				"|_|" + 
				"   ";
		Assert.assertThat("input on position 0 should result in same output." , output, Matchers.equalTo(expectedOutput));
	}
	
	@Test
	public void testInput01Position1() throws Exception {
		
		DigitReader reader = new DigitReader();
		
		String input = " _    \n" + 
				"| |  |\n" + 
				"|_|  |\n" + 
				"      \n";
		int position1 = 1;
		String output = reader.read(input, position1);
		
		String expectedOutput = "   " + 
				"  |" + 
				"  |" + 
				"   ";
		Assert.assertThat("input on position 0 should result in same output." , output, Matchers.equalTo(expectedOutput));
	}
	@Test(expected = IllegalArgumentException.class)
	public void expectExceptionForInputWithLineLength3() throws Exception {
		
		DigitReader reader = new DigitReader();
		
		String input = " _    \n" + 
				"| |  |\n";
		
		int position1 = 1;
		reader.read(input, position1);
	}
	
}
