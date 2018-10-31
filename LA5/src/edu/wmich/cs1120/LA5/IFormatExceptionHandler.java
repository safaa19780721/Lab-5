package edu.wmich.cs1120.LA5;
import java.io.*;


public interface IFormatExceptionHandler {
	void handleFileNotFoundException(FileNotFoundException e);
	void handlePhoneNumberFormatException(PhoneNumberFormatException e);
	void handleEmailFormatException(EmailAddressFormatException e);
	void handleNameFormatException(NameFormatException e);
}
