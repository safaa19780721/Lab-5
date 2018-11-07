package edu.wmich.cs1120.LA5;

import java.io.FileNotFoundException;

public class FormatExceptionHandler implements IFormatExceptionHandler {

	public void handleFileNotFoundException(FileNotFoundException e) {
		System.out.println(e);
	}
	public void handlePhoneNumberFormatException(PhoneNumberFormatException e) {
		
	}
	public void handleEmailFormatException(EmailAddressFormatException e) {
		
	}
	public void handleNameFormatException(NameFormatException e) {
		
	}
}
