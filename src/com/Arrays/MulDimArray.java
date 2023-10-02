package com.Arrays;

public class MulDimArray {

	public static void main(String[] args) {

		int a[][]= { {1,2,3}, {2,3,4}  };
		
//		for(int i=0;i<2;i++) {
//			
//			for(int j=0;j<3;j++) {
//				System.out.println(a[i][j]);
//			}
//			
//		}
		
		for(int i[]:a) {
			
			for(int j:i) {
				
				System.out.print(j +" ");
				
			}
			System.out.println();
		}

	}

}
