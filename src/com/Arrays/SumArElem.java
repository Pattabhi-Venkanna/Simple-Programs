package com.Arrays;

public class SumArElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		int sum=0;
		int i=0;
//		while(i<a.length) {
//			
//			sum+=a[i];
//			i++;
//		}
		
		do {
			sum+=a[i];
			i++;
		}
		while(i<a.length);
		System.out.println("sum of array elememts are "+sum);
		

	}

}
