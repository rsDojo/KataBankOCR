package com.rola.dojo.bank;

class DigitReader {

	private static final int DIGIT_LENGTH = 4;
	private static final int DIGIT_WIDTH = 3;

	String read(String input, int position) {

		String[] lines = input.split("\n");
			
		if(lines.length != DIGIT_LENGTH)
			throw new IllegalArgumentException();
		
		String output = "";
		
		for (String line : lines) {
			if( line.length()<(position+1)*DIGIT_WIDTH)
				throw new IllegalArgumentException();
			
			int startPos = position*DIGIT_WIDTH;
			output += line.substring(startPos, startPos+DIGIT_WIDTH);
		}
		return output;
	}
	
	
}
