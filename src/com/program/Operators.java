package com.program;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		System.out.println("Enter first number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		int c,d,e,f,g;
		c=a+b;
		d=a-b;
		e=a*b;
		f=a/b;
		g=a%b;
		System.out.println("addition of a and b is "+c);
		System.out.println("substraction of a and b is "+d);
		System.out.println("multiplication of a and b is " +e);
		System.out.println("division of a and b is "+f);
		System.out.println("modulus of a and b is "+g);
		sc.close();
		

	}

}
