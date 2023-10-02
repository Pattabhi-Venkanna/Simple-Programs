package com.test;

abstract class Animal{
	public abstract void animalSound();
	public void sleep() {
		System.out.println("zzz");
	}
}
class Pig extends Animal{

	@Override
	public void animalSound() {
		System.out.println("The pig says: Wee Wee");
		
	}
	
}
public class SimpleClass {

	public static void main(String[] args) {
		Pig m= new Pig();
		m.animalSound();
		m.sleep();

	}

}
