package edu.wmich.cs1120.LA5;
import java.io.File;
import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String[] filePaths = {"testcase1.txt","testcase2.txt", "testcase3.txt", "testcase4.txt", "testcase5.txt", "testcase6.txt", "testcase7.txt", "testcase8.txt", "testcase9.txt", "testcase10.txt"};
		ContactInformationFormatter formatter = new ContactInformationFormatter();
		formatter.readContactInformation(filePaths);
	}
}
