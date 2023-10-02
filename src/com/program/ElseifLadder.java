package com.program;

import java.util.Scanner;

public class ElseifLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("enter your marks");
		int m= sc.nextInt();
		if(m<35)
			System.out.println("fail");
		else if (m>=35&&m<=50) 
			System.out.println("d grade");
		else if (m>=50&&m<=70) 
			System.out.println("c grade");
		else if (m>=70&&m<=80) 
			System.out.println("b grade");
		else if (m>=80&&m<=90) 
			System.out.println("a grade");
		else if (m>=90&&m<=100) 
			System.out.println("a+ grade");
		else
			System.out.println("invalid number");
	}

}
