package com.Exception;

import java.util.Scanner;

public class FirstException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(a);
		try {
			System.out.println("result is "+a/0);
		}
		catch (Exception e) {
			System.out.println("hello");
		}
		finally {
			System.out.println(a/0);
		}
		System.out.println();
		

	}

}
