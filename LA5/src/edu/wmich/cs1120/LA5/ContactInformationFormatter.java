package edu.wmich.cs1120.LA5;
import java.util.Scanner;
import java.io.File;
import java.util.*;

public class ContactInformationFormatter implements IContactInformationFormatter {

	private Scanner in;
	private String emailLine, firstLetter, phoneDigits = "";
	private ArrayList<String> names, firstName, lastName, phoneNumber, emails;
	
	public void readContactInformation(String[] filePaths) {
		for(int i = 0; i < filePaths.length;i++) {
			in = new Scanner(filePaths[i]);
			while(in.hasNext()) {
				firstName.add(in.next());
				lastName.add(in.next());
				phoneNumber.add(in.nextLine());
				emails.add(in.nextLine());
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

	@Override
	public void formatEmail(String email) throws EmailAddressFormatException {
		// TODO Auto-generated method stub

	}

	@Override
	public void formatPhoneNumber(String phoneNumber) throws PhoneNumberFormatException {
		// TODO Auto-generated method stub

	}

}
