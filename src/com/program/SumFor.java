package com.program;

public class SumFor {
	
	public static int add(int ...n) {
		int sum=0;
		for(int i:n) {
			
			sum+=i;
		}
		return sum;
		
	}
	static {
		System.out.println(add(1,2,3,4,5));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
