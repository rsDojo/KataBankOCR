package com.rola.dojo.bank;

public class Parser {

	
	private final DigitReader reader = new DigitReader();
	private final SingleParser parser = new SingleParser();

	public String parse(final String input) {
		if (input == null) {
			throw new IllegalArgumentException();
		}
		
		final int numberOfDigits = getNumberOfDigits(input);
		String output = "";
		
		for (int i=0; i<numberOfDigits; i++)
		{
			output += getParsedDigit(input, i);
		}
		return output;
	}

	private String getParsedDigit(final String input, int i) {
		final String strDigit = reader.read(input, i);
		
		return parser.parseSingle(strDigit);
	}

	private int getNumberOfDigits(final String input) {
		final int numberOfDigits = input.split("\n")[0].length()/3;
		return numberOfDigits;
	}
}
