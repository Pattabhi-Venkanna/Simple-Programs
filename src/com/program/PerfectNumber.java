package com.program;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		int n,sum=0,i;
		System.out.println("enter  number to find perfect number ");
		n=new Scanner(System.in).nextInt();
		
		for(i=1;i<=n/2;i++) {
			
			if(n%i==0) {
				sum+=i;
				System.out.println("factors are "+i);
			}
		}
		
		if(sum==n) System.out.println("perfect number");
		else System.out.println("not perfect");

	}

}
