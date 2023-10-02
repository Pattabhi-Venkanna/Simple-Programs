package com.program;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter number to check prime or not");
		int n=new Scanner(System.in).nextInt();
		int count=0;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				count++;
			
		}
		if(count==2)System.out.println("number is prime");
		else System.out.println("not prime");

	}
}
