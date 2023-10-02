package com.Oops;
// multi-level inheritance
/*class A{
	
	public void write() {
		System.out.println("he can write");
	}
	
}

class B extends A{
	
	public void read() {
		System.out.println("he can read");
		
	}
	
}
class C extends B{
	
	void play() {
		
		System.out.println("he can play");
		
	}
	
}   */

// heirarchical inheritance
class A{
	void add() {
		System.out.println("this is add method in class A");
	}
}
class B extends A{
	void sub() {
		System.out.println("this is sub method in class B");
	}
}
class C extends A{
	void mul() {
		System.out.println("this is mul method in class C");
	}
}

public class InheritanceExample {

	public static void main(String[] args) {

//		B a=new B();
//		a.read();
//		a.write();
		
		
//		C c=new C();
//		c.write();
//		c.read();
//		c.play();
		
		B b=new B();
		b.add();
		b.sub();
		
		C c=new C();
		c.add();
		c.mul();
			

	}

}
