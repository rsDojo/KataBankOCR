package com.rola.dojo.bank;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class NumberOfLinesTest {

	private String input123456789_4Lines = 
			  "    _  _     _  _  _  _  _ \n" + 
			  "  | _| _||_||_ |_   ||_||_|\n" + 
			  "  ||_  _|  | _||_|  ||_| _|\n" + 
			  "                           ";
	
	private String input123456789_3Lines = 
					"    _  _     _  _  _  _  _ \n" + 
					"  | _| _||_||_ |_   ||_||_|\n" + 
					"  ||_  _|  | _||_|  ||_| _|\n"; 
	
	@Test
	public void numberOfLinesShould4() {
		assertThat("Line count should be 4", Parser.numberOfLines(input123456789_4Lines), equalTo(4));
	}
	
	@Test
	public void numberOfLinesShould3() {
		assertThat("Line count should be 3", Parser.numberOfLines(input123456789_3Lines), equalTo(3));
	}
	
	@Test
	public void columnCountShouldBeMultipleOf3() {
		assertThat("Column count should be 0%3", Parser.lineLength(input123456789_3Lines)%3, equalTo(0));
	}
	
	
}
