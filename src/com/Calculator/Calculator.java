package com.Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double a,b;
		
		System.out.println("enter a, b values");
		a=sc.nextDouble();
		b=sc.nextDouble();
		
		System.out.println("choose options");
		System.out.println("enter 1.Addition    2.Subtraction     3.multiplication     4.division");
		
		Driver d=new Driver();
		int n=sc.nextInt();
		
		
		
		switch(n) {
		case 1:d.addition(a, b);break;
		case 2:d.subtraction(a, b);break;
		case 3:d.multiplication(a, b);break;
		case 4:d.division(a, b);break;
		default: System.out.println("wrong input");
		
		}
		
		sc.close();
	}

}
