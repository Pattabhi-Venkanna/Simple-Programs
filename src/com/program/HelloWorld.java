package com.program;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		//Simply First program in institute
		System.out.println("Hello World");
		System.out.println("I Am Pattabhi Venkanna");
		System.out.println("Enter a number to check function of scanner");
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		System.out.println("enterd number is:"+a);
		if(a>10)                  
			System.out.println("enterd number is greater than ten");
		
		else
			System.out.println("enterd number is less than ten");
		
		// Print numbers from 1 to entered number
		for(int i=1;i<=a;i++) 
			System.out.print(i+",");
		sc.close();
		}
		

	}


