package com.rola.dojo.bank;

public enum Digits {

	//@formatter:off
	ZIFFER0 ( 
			" _ " + 
			"| |" + 
			"|_|" + 
			"   "),
	ZIFFER1 ( 
			"   " + 
			"  |" + 
			"  |" + 
			"   "),
	ZIFFER2( 
			" _ " + 
			" _|" + 
			"|_ " + 
			"   "),
	ZIFFER3( 
			" _ " + 
			" _|" + 
			" _|" + 
			"   "),
	ZIFFER4( 
			"   " + 
			"|_|" + 
			"  |" + 
			"   "),
	ZIFFER5( 	
			" _ " + 
			"|_ " + 
			" _|" + 
			"   "),
	
	ZIFFER6(
			" _ " + 
			"|_ " + 
			"|_|" + 
			"   "),
	ZIFFER7( 	
			" _ " + 
			"  |" + 
			"  |" + 
			"   "),
	ZIFFER8( 	
			" _ " + 
			"|_|" + 
			"|_|" + 
			"   "),
	ZIFFER9( 	
			" _ " + 
			"|_|" + 
			" _|" + 
			"   ");

	
	//@formatter:on
	
	private String matrix;

	Digits(String matrix)
	{
		this.matrix = matrix;
	}
	
	boolean compare(String compareTo)
	{
		return matrix.equals(compareTo);
	}

	public String getText() {
		return Integer.toString(ordinal());
	}
		
}
