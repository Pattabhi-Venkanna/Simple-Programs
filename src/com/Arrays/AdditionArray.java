package com.Arrays;

import java.util.Arrays;

public class AdditionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]=new int[][] { {1,2,3}, {4,5,6} , {7,8,9}  };
		int b[][]=new int[][] { {1,2,3}, {4,5,6} , {7,8,9}  };
		int c[][]=new int [3][3];
		
		for (int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				c[i][j]=a[i][j]+b[i][j];
				System.out.print("  "+c[i][j]);
				
			}
			System.out.println();
			
		}
		
		

	}

}
