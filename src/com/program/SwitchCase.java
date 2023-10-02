package com.program;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome pattabhi");
		System.out.println("enter your password");
		int pass=sc.nextInt();
		
		if (pass==1122) {
			System.out.println("1. withdraw  2. statement");
			System.out.println("choose your option");
			int select=sc.nextInt();
			 switch(select) {
			 
			 case 1:System.out.println("draw your money"); break;
			 case 2: System.out.println("see your statement"); break;
			 
			 default:System.out.println("invalid ");
			 
			 
			 }
			
		}
		else
			System.out.println("wrong password");

	}

}
