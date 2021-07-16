package com.bridgelabz.program;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRule1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password");
		String password = sc.next();
		Pattern p = Pattern.compile("^[A-Za-z]{8}$");
		Matcher m = p.matcher(password);
		boolean b = m.matches();
        System.out.println(b);
	}

}	
