package com.program;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value");
		String a= sc.nextLine();
		System.out.println("Enterd value is "+a);
		
		System.out.println("-------------");
		
		System.out.println("enter your name");
		String b=sc.nextLine();
		
		System.out.println("my name is "+b);
		
		sc.close();

	}

}
