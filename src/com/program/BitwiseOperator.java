package com.program;

public class BitwiseOperator {

	public static void main(String[] args) {
		//64 32 16   8 4 2 1
		int a=3;//011
		int b=6;//110
		System.out.println("bitwise and operator "+ (a&b)); //010
		System.out.println("bitwise or operator "+ (a|b)); //111
		System.out.println("compliment " + ~a);//0
		

	}

}
