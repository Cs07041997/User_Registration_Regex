package com.bridgelabz.program;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileFormat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mobile number");
		String mobileNumber = sc.next();
		Pattern p = Pattern.compile("^[9][1][-][0-9]{10}$");
		Matcher m = p.matcher(mobileNumber);
		boolean b = m.matches();
        System.out.println(b);
	}

}
