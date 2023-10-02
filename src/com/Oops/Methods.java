package com.Oops;

public class Methods {

	static {
		add();
		add(1);
		hi();
		int k=hi(2,3);
		System.out.println(k);
		System.out.println(hi(4,5));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
	}
	
	public static void add() {
		System.out.println("method with no return type and no areguments");
	}

	public static void add(int a) {
		System.out.println("method with no return type and with areguments");
	}
	public static int hi() {
		System.out.println("method with  return type and no areguments");
		return 0;
	}
	public static int hi(int a,int b) {
		int m=a;
		int n=b;
		System.out.println("method with  return type and with areguments");
		return m+n;
	}
}
