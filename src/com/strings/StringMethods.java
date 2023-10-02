package com.strings;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="ms soft technologies";
		String b=new String("naren technologies");
		System.out.println("length method "+a.length());
		System.out.println("replace method "+b.replace('n', 'k'));
		System.out.println("replace all method "+a.replaceAll("ms", "naren"));
		System.out.println("contains method "+a.contains("ms"));
		System.out.println("chatAt method "+a.charAt(1));
		System.out.println("join method "+a.join(a, b));
		System.out.println("byte method "+a.getBytes());
		System.out.println("trim method "+a.trim());
		System.out.println("lower methods "+a.toLowerCase());
		System.out.println("upper methods "+a.toUpperCase());
		System.out.println("to char array method "+a.toCharArray());
		System.out.println("empty method "+a.isEmpty());
		System.out.println("index of method "+a.indexOf("o"));
		
		
		

	}

}
