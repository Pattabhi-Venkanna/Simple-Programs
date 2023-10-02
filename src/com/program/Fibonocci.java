package com.program;

import java.util.Scanner;

public class Fibonocci {

	public static void main(String[] args) {

		int i=1;
		int f=0;
		int f1=1;
		int f2=1;
		
		do {
			System.out.print(f+",");
			f1=f2;
			f2=f;
			f=f1+f2;
			i++;
			
		}
		while(i<=10);
		
		
			
		

	}

}
