package com.rola.dojo.bank;

final class SingleParser {
	
	SingleParser() {
	}

	String parseSingle(String input) {
		for (Digits digit : Digits.values()) {
			if (digit.compare(input))
				return digit.getText();
		}
		return "?";
	}

}
