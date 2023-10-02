package com.program;

public class WhileFactorial {

	public static void main(String[] args) {
		int a=3;
		int fact=1;
		int i=a;
		   
		while(i>=1) {
			fact=fact*i;
			i--;
		}
		System.out.println(fact);
	}

}
