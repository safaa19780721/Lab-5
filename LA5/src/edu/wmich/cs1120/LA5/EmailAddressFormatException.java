package edu.wmich.cs1120.LA5;

public class EmailAddressFormatException extends Exception{

	public EmailAddressFormatException(String errorMessage) {
		super(errorMessage);
	}
	
	public static boolean isEmailAddressFormatException(String emailAddress) {
		return true;
	}
}
