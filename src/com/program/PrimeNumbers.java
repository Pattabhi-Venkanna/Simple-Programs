package com.program;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		System.out.println("enter a number to print prime numbers");
		int n=new Scanner(System.in).nextInt();
		int count  ;
		
		for(int i=1;i<=n;i++) {
			count=0;
			for(int j=1; j<=i;j++) {
				
				if(i%j==0) {
					count++;
				}
				
			}
			if(count==2) {
				System.out.println(i);
			}
			
		}
		
	}

}
