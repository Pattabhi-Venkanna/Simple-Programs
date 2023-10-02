package com.program;

import java.util.Scanner;

public class ConditionStmt {

	public static void main(String[] args) {

		// program for elibible to vote or not
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		
		int age=sc.nextInt();
		if(age>18)
			System.out.println("eligible to vote");
		else
			System.out.println("not eligible");
		System.out.println();
		
		
		
		if(age%2==0)
			System.out.println("enter age is even");
		else
			System.out.println("enter age is odd");

	}

}
