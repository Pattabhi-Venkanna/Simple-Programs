package com.test;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		int arr[]= {1,6,1,2,3,1,2,3,4,5};
		System.out.println(arr.length);
		
		Set<Integer> s= new HashSet<Integer>();
		for(int a:arr) {
			s.add(a);
			
		}
		System.out.println(s);

	}

}
