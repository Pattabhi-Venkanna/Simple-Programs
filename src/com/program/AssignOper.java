package com.program;

import java.util.Scanner;

public class AssignOper {

	public static void main(String[] args) {

		System.out.println("enter a number :");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=a;
		System.out.println("the value of b is "+b);
		System.out.println("the value of b is "+(b*=a));
		System.out.println("the value of b is "+(b-=a));
		sc.close();
		
	}

}
