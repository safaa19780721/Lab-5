package edu.wmich.cs1120.LA5;

public interface IContactInformationFormatter {
	void readContactInformation(String[] filePaths);
	void formatContactInformation(String fileName);
	void formatName(String name) throws NameFormatException;
	void formatEmail(String email) throws EmailAddressFormatException;
	void formatPhoneNumber(String phoneNumber) throws PhoneNumberFormatException;
}
