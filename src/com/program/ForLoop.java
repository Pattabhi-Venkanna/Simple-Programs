package com.program;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {

		System.out.println("enter a number to print even number upto enterd number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<=a;i+=2) {
			System.out.println(i);
		}
		sc.close();

	}

}
