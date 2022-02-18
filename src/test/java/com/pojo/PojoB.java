package com.pojo;

public class PojoB {
	
	public static void main(String[] args) {
		
		PojoA a = new PojoA();
		
		int age = a.getAge();
		
		System.out.println(age);
		
		a.setAge(22);
		
		System.out.println("Using Setter");
		
		int value = a.getAge();
		
		System.out.println("Age : "+value);
		
		String name = a.getName();
		
		System.out.println(name);
		
		a.setName("ashu");
		
		System.out.println("Using");
		
		String string = a.getName();
		
		System.out.println("Name : "+string);
		
		
		
	}

}
