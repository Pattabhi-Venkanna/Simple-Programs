package com.simpleprojecct;

public class TrainInstitute {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setName("Abhi");
		s1.setAge(22);
		s1.setRollno(434);
		s1.setFee(20000);
		System.out.println("---------------Student Details---------------");
		System.out.println("name is "+s1.getName()+", age is"+s1.getAge()+", rollno is "+s1.getRollno()+", you fee is "+s1.getFee());
		
		
		Employee e1=new Employee();
		e1.setName("karna");
		e1.setAge(43);
		e1.setId(27);
		e1.setSalary(3000);
		System.out.println("---------------Faculty Details---------------");
		System.out.println("employee name is "+e1.getName()+", age is "+e1.getAge()+", Id is "+e1.getId()+", salary is "+e1.getSalary());
		

	}

}
