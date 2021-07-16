package com.bridgelabz.program;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ClearEmailSample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				
		System.out.println("Enter Your All Email Samples Provided Separately");
		String password = sc.next();
		System.out.println(Pattern.matches("^[a-zA-Z0-9_.][-][+][a-zA-Z0-9]@[a-zA-Z0-9]+([.][a-zA-Z]+)$", password));
	}
}	
