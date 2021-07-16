package com.bridgelabz.program;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name");
		String lastName = sc.next();
		Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{2}$");
		Matcher m = p.matcher(lastName);
		boolean b = m.matches();
        System.out.println(b);
	}

}
