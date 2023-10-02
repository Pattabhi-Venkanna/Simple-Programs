package com.program;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		while(true) {
			System.out.println("enter number to check armstrong or not");
			int n=new Scanner(System.in).nextInt();
			int sum=0;
			int rem;
			int temp=n;
		
			while(n>0) {
			
				rem=n%10;
				sum=sum+(rem*rem*rem);
				n=n/10;
			
			}
		
			if(sum==temp) System.out.println("armstrong number");
			else System.out.println("not armstrong");
			System.out.println( );

		}
		
	}

}
