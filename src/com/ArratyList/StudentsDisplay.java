package com.ArratyList;

import java.util.ArrayList;

class Student{
	
	int rno;
	int fee;
	String name;
	
	Student(int rno,int fee, String name){
		
		this.rno=rno;
		this.fee=fee;
		this.name=name;
		
	}
	
}

class AddingData{
	
	ArrayList<Student> studentData(){
		Student s1=new Student(1, 10000, "Ram");
		Student s2=new Student(2, 10000, "Shiva");
		Student s3=new Student(3, 10000, "Karna");
		ArrayList<Student> stlist=new ArrayList<Student>();
		stlist.add(s1);
		stlist.add(s2);
		stlist.add(s3);
		return stlist;
		
	}
	
}

public class StudentsDisplay {

	public static void main(String[] args) {
		
		AddingData data=new AddingData();
		ArrayList<Student> listStudent=data.studentData();
		for(Student st:listStudent) {
			
			System.out.println("Student name : "+st.name);
			System.out.println("Studet roll no : "+st.rno);
			System.out.println("Student fee is "+st.fee);
			System.out.println(" hj");
			
		}
		

	}

}
