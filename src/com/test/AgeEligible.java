package com.test;

import java.util.Scanner;

public class AgeEligible {
	int i=m1();
	AgeEligible(){
		System.out.println("Constructor");
	}
	int m1() {
		System.out.println("m1 method");
		return 20;
	}{
		System.out.println("block");
	}
//	static void quiz(int n) {
//		if (n==1) {
//			return;
//		}
//		System.out.println(n+1);
//		quiz(n-1);
//		System.out.println(n+1);
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			System.out.println("enter youtr age");
//			int age=new Scanner(System.in).nextInt();
//			if(age>25)
//				System.out.println("you are eliogible for job");
//			else
//				System.out.println("you are not eligible");
//		quiz(4);
		AgeEligible a=new AgeEligible();
		

	}

}
