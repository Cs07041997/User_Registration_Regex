package com.bridgelabz.program;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name");
		String firstName = sc.next();
		Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{2}$");
		Matcher m = p.matcher(firstName);
		boolean b = m.matches();
		//System.out.println(Pattern.matches(("^[A-Z]{1}[a-z]{2}$"), firstName));
        System.out.println(b);
	}

}
