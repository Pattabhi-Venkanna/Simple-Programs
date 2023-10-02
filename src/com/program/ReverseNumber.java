package com.program;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("enter a  number to reverse");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem;
		int rev=0;/*
		while(n>0){
			
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
			
		}
		System.out.println("reverse number is "+rev);  */
		
		System.out.println("using for loop to reverse a number");
		
		for(int i=0;n>0;i++) {
			
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		System.out.println("reverse number is "+rev);
		sc.close();
	}

}
