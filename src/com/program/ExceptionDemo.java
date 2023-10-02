package com.program;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionDemo {

	public static void main(String[] args) {
		
//		int i,j,k=0;
//		i=8;
//		j=0;
//		try {
//			k=i/j;	//Critical Exception
//		}
//		catch(Exception e) {
//			System.out.println(e);
//			System.out.println("Cannot divide by zero "+e);
//		}
		
		int i=4,j=1,k=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			j=Integer.parseInt(br.readLine());
			k=i/j;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(k);
		
		
	}

}
