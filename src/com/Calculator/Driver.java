package com.Calculator;

public class Driver implements ICalculator {

	@Override
	public void addition(double a, double b) {
		double add=a+b;
		System.out.println("addition of two numbers is "+add);
		
	}

	@Override
	public void subtraction(double a, double b) {
		double sub=a-b;
		System.out.println("subtraction of two numbers is "+sub);
		
	}

	@Override
	public void multiplication(double a, double b) {
		double mul=a*b;
		System.out.println("multiplication of two numbers is "+mul);
		
	}

	@Override
	public void division(double a, double b) {
		double div=a/b;
		System.out.println("division of two numbers is "+div);
		
		
	}

}
