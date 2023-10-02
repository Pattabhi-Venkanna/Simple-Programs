package com.Arrays;


import java.util.*;

public class MinMax {

	public static void main(String[] args) {
		
		
		int a[]= {1,3,4,98,34,6,55};
		int max=a[0];
		int min=a[0];
		System.out.println(Arrays.toString(a));
		
		for(int i:a) {
			
			if(max<i)
				max=i;
			
			if(min>i)
				min=i;
			
			
		}
		System.out.println("maximum number in array is "+max);
		System.out.println("minimum number in array is "+min);


	}

}
