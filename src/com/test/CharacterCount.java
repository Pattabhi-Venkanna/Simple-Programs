package com.test;

import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String inputString=sc.nextLine();
		
		System.out.println("enter the character to count");
		char characterToCount=sc.next().charAt(0);
		
		System.out.println(inputString);
		System.out.println(characterToCount);
		System.out.println(countCharacter(inputString,characterToCount));

	}
	public static int countCharacter(String s,char c) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c) count++;
		}
		return count;
	}

}
