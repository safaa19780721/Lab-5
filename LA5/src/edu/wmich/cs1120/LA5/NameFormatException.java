package edu.wmich.cs1120.LA5;

public class NameFormatException extends Exception{

	public NameFormatException(String errorMessage) {
		super(errorMessage);
	}
	
	public static boolean isNameFormatException(String nameLine) {
		return true;
	}
}
