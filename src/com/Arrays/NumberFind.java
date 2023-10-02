package com.Arrays;

import java.util.Arrays;

public class NumberFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		int n=5;
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			if(n==a[i])
				System.out.println("number found at index "+i);
		}

	}

}
