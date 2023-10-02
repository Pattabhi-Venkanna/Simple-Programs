package com.test;

public class Factorial {
	
	public static int factorial(int n) {
		if(n==0||n==1) return 1;
		return n*factorial(n-1);
		
	}

	public static void main(String[] args) {
		
		int num=3;
		System.out.println("The factorial of given number is "+factorial(num));

	}

}
