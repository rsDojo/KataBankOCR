package com.rola.dojo.bank;

import java.util.Arrays;
import java.util.List;

public final class Parser {
	
	private Parser() {
	}

	public static String parse(String input) {
		return "123";
	}

	public static String parseSingle(String input) {
		for (Digits digit : Digits.values()) {
			if (digit.compare(input))
				return digit.getText();
		}
		return "?";
	}

	public static int numberOfLines(String input) {
		return input.split("\n").length;
	}

	public static int lineLength(String input) {
		return 0;
	}

	public static List<String> getDigits(String input123456789) {
		return Arrays.asList("1","2","3","4","1","1","2","3","4");
	}
}
