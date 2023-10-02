package com.Oops;

public class Institute {

	public static void main(String[] args) {
		System.out.println("---------------by refernce----------------------");
		Student s=new Student();
		s.name="karna";
		s.age=78;
		s.id=567;
		System.out.println(s.name);
		System.out.println(s.id);
		System.out.println(s.age);
		
		Addition ad=new Addition();
		ad.a=12;
		ad.b=13;
		System.out.println("Addition is "+ad.add());
		System.out.println();
		
		System.out.println("----------------by method--------------");
		
		Subst su=new Subst();
		System.out.println("Substraction is "+su.substraction(15, 10));
		System.out.println();
		
		System.out.println("-----------------by constructor------------------");
		Sports sp=new Sports("karna", 7);
		
		Rectangle r=new Rectangle(12,10);
		
		Rectangle r1=new Rectangle();
		
		//circle area 
		Circle c = new Circle(5);
		
	}

}
class Student{
	
	String name;
	int age;
	int id;

}
class Addition{
	
	int a;
	int b;
	int add() {
		
		return a+b;
	}
	
}
class Subst{
	
	int substraction(int a,int b) {
		
		return a-b;
	}
	
}
class Sports{
	
	String name;
	int matches;
	Sports( String name, int matches){
		this.name=name;
		this.matches=matches;
		
		System.out.println(name+":"+matches);
		
	}
	
}

class Circle{
	
	
	Circle(int r){
		
		System.out.println("area of circle is "+((22/7)*r*r));
	}
	
}

class Rectangle{
	
	int l;
	int b;
	
	//constructer overloading
	Rectangle(){
		System.out.println("this is default constructer");
		
	}
	Rectangle(int l,int b){
		
		this.l=l;
		this.b=b;
		System.out.println("area of rectangle is "+l*b);
	}
	
}
