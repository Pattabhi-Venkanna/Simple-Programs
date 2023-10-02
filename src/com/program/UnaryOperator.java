package com.program;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=13;
		
		System.out.println("a value after pre increment "+ ++a); //11
		System.out.println("a value after post increment "+ a++); //11
		System.out.println("now a value is "+ a);//12
		
		System.out.println("b value after pre decerment "+ --b);//12
		System.out.println("b value after post decrement "+ b--);//12
		System.out.println("now b value is "+ b); //11
	}

}
