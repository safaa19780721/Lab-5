package edu.wmich.cs1120.LA5;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ContactInformationFormatter implements IContactInformationFormatter {

	private Scanner in;
	NameFormatException nameException = new NameFormatException("Name is wrong format");
	PhoneNumberFormatException phoneException = new PhoneNumberFormatException("Phone number is wrong format");
	EmailAddressFormatException emailException = new EmailAddressFormatException("Email address is wrong format");
	FormatExceptionHandler exceptionHandler = new FormatExceptionHandler();
	private String emailLine, firstLetter, phoneDigits = "";
	private ArrayList<String> names, firstName, lastName, phoneNumber, emails;
	
	public void readContactInformation(String[] filePaths) {
		for(int i = 0; i < filePaths.length;i++) {
			try {
				File inFile = new File(filePaths[i]);
				in = new Scanner(inFile);
				while(in.hasNext()) {
					firstName.add(in.next());
					lastName.add(in.next());
					phoneNumber.add(in.nextLine());
					emails.add(in.nextLine());
					if(!nameException.isNameFormatException(firstName.get(i) + lastName.get(i))) {
						throw new NameFormatException("");
					}
					if(!phoneException.isPhoneNumberFormatException(phoneNumber.get(i))) {
						throw new PhoneNumberFormatException("");
					}
					if(!emailException.isEmailAddressFormatException(emails.get(i))) {
						throw new EmailAddressFormatException("");
					}
				}
			}
			catch(FileNotFoundException e) {
				exceptionHandler.handleFileNotFoundException(e);
			}
			catch(NameFormatException e) {
				exceptionHandler.handleNameFormatException(e);
			}
			catch(PhoneNumberFormatException e) {
				exceptionHandler.handlePhoneNumberFormatException(e);
			}
			catch(EmailAddressFormatException e) {
				exceptionHandler.handleEmailFormatException(e);
			}
			
		}
		
	}

	public void formatContactInformation(String fileName) {
		for(int i = 0; i < firstName.size(); i++) {
			//Formatting Name
			firstName.get(i).toUpperCase();
			firstLetter = firstName.get(i).substring(0, 1);
			firstLetter.toUpperCase();
			firstName.set(i, (firstLetter + firstName.get(i).substring(1)));
			
			lastName.get(i).toUpperCase();
			firstLetter = lastName.get(i).substring(0, 1);
			firstLetter.toUpperCase();
			lastName.set(i, (firstLetter + lastName.get(i).substring(1)));
			
			names.set(i, firstName.get(i) + lastName.get(i));
			
			//Formatting Phone Number
			for(int x = 0; x < phoneNumber.get(i).length(); x++) {
				try {
					Integer.parseInt(phoneNumber.get(i));
					phoneDigits = phoneDigits + phoneNumber.get(i).charAt(x); 
				} catch(NumberFormatException E) {
				} catch(NullPointerException E) {
				}
			}
			phoneNumber.set(i,("("+ phoneDigits.substring(0,3)) + ")" + phoneDigits.substring(3,7) + "-" + phoneDigits.substring(7));
			
			//Formatting Email
			
		}
	}

	public void formatName(String name) throws NameFormatException {
		
	}
	
	public void formatEmail(String email) throws EmailAddressFormatException {

	}

	public void formatPhoneNumber(String phoneNumber) throws PhoneNumberFormatException {

	}
	

}
