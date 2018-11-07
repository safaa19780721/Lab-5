package edu.wmich.cs1120.LA5;

public class PhoneNumberFormatException extends Exception{
	
	public PhoneNumberFormatException(String errorMessage) {
		super(errorMessage);
	}
	
	public static boolean isPhoneNumberFormatException(String phoneNumber) {
		return true;
	}

}
