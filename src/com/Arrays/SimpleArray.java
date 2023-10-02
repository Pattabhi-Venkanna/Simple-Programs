package com.Arrays;

import java.util.Arrays;

public class SimpleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= { 3,1,7,23,4};
		int temp;
		
		
		System.out.println("before sorting array elements are: ");
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		
		System.out.println("after sorting array elements are: ");
		
		System.out.println(Arrays.toString(a));

	}

}
